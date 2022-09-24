package com.lettieri.application.notification.ApplicationNotification.services;

import com.lettieri.application.notification.ApplicationNotification.model.NotificationMode;
import com.lettieri.application.notification.ApplicationNotification.model.gateway.NotificationGatewayRequest;
import com.lettieri.application.notification.ApplicationNotification.model.gateway.NotificationGatewayResponse;
import com.lettieri.application.notification.ApplicationNotification.model.preferences.NotificationPreferences;
import com.lettieri.application.notification.ApplicationNotification.model.template.NotificationTemplate;
import com.lettieri.application.notification.ApplicationNotification.model.template.NotificationTemplateResponse;
import com.lettieri.application.notification.ApplicationNotification.repositories.NotificationGatewayRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class NotificationGatewayService {

    NotificationGatewayRepository notificationGatewayRepository;

    public NotificationGatewayResponse send(String customerId,
                                            NotificationMode notificationMode,
                                            NotificationTemplate notificationTemplate,
                                            NotificationPreferences notificationPreferences,
                                            NotificationTemplateResponse notificationTemplateResponse) {

        NotificationGatewayRequest notificationGatewayRequest = NotificationGatewayRequest.builder()
                .customerId(customerId)
                .notificationContent(notificationTemplateResponse.getContent())
                .emailAddress(notificationPreferences.getEmailAddress())
                .phoneNumber(notificationPreferences.getPhoneNumber())
                .emailSubject(notificationTemplate.message)
                .notificationMode(notificationMode)
                .build();

        notificationGatewayRepository.send(notificationGatewayRequest);
        return notificationGatewayRepository.send(notificationGatewayRequest);
    }
}
