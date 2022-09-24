package com.lettieri.application.notification.ApplicationNotification.controllers;

import com.lettieri.application.notification.ApplicationNotification.entities.NotificationReference;
import com.lettieri.application.notification.ApplicationNotification.formatters.NotificationTemplateMapper;
import com.lettieri.application.notification.ApplicationNotification.model.NotificationMode;
import com.lettieri.application.notification.ApplicationNotification.model.NotificationRequest;
import com.lettieri.application.notification.ApplicationNotification.model.gateway.NotificationGatewayResponse;
import com.lettieri.application.notification.ApplicationNotification.model.preferences.NotificationPreferences;
import com.lettieri.application.notification.ApplicationNotification.model.template.NotificationTemplateRequest;
import com.lettieri.application.notification.ApplicationNotification.model.template.NotificationTemplateResponse;
import com.lettieri.application.notification.ApplicationNotification.services.NotificationGatewayService;
import com.lettieri.application.notification.ApplicationNotification.services.NotificationPreferencesService;
import com.lettieri.application.notification.ApplicationNotification.services.NotificationReferenceService;
import com.lettieri.application.notification.ApplicationNotification.services.NotificationTemplateService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@AllArgsConstructor
public class ApplicationNotificationController {

    NotificationPreferencesService notificationPreferencesService;
    NotificationTemplateService templateService;
    NotificationGatewayService notificationGatewayService;
    NotificationTemplateMapper notificationMapper;

    NotificationReferenceService notificationReferenceService;


    @PostMapping("/notifications")
    public ResponseEntity<NotificationGatewayResponse> sendNotification(@RequestBody NotificationRequest notificationRequest) {
        NotificationPreferences notificationPreferences = notificationPreferencesService.getPreferences(notificationRequest);
        NotificationMode notificationMode = getNotificationMode(notificationPreferences);
        NotificationTemplateRequest notificationTemplateRequest = notificationMapper.toNotificationTemplateRequest(notificationRequest);
        notificationTemplateRequest.setNotificationMode(notificationMode);
        NotificationTemplateResponse notificationTemplateResponse = templateService.getTemplate(notificationTemplateRequest);
        NotificationReference notificationReference = NotificationReference.builder()
                .notificationRequest(notificationMapper.toNotificationRequestEntity(notificationRequest))
                .notificationPreferences((notificationMapper.toNotificationPreferencesEntity(notificationPreferences)))
                .notificationTemplate((notificationMapper.toNotificationTemplateEntity(notificationTemplateResponse)))
                .build();
        Integer notificationReferenceId = notificationReferenceService.save(notificationReference).getId();
        NotificationGatewayResponse notificationGatewayResponse = notificationGatewayService.send(notificationRequest.getCustomerId(),
                notificationMode,
                notificationRequest.getNotificationTemplateName(),
                notificationPreferences,
                notificationTemplateResponse);
        notificationGatewayResponse.setNotificationReferenceId(notificationReferenceId.toString());
        return ResponseEntity.ok(notificationGatewayResponse);
    }

    private NotificationMode getNotificationMode(NotificationPreferences notificationPreferences) {

        NotificationMode notificationMode = notificationPreferences.getEmailPreferenceFlag()? NotificationMode.EMAIL :
                notificationPreferences.getSmsPreferenceFlag()? NotificationMode.SMS : null;
        if(notificationMode == null) {
            throw new IllegalArgumentException("Notification mode not supported");
        }
        return  notificationMode;
    }
}
