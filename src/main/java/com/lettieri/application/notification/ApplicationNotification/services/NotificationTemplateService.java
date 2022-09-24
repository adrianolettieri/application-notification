package com.lettieri.application.notification.ApplicationNotification.services;

import com.lettieri.application.notification.ApplicationNotification.model.template.NotificationTemplateRequest;
import com.lettieri.application.notification.ApplicationNotification.model.template.NotificationTemplateResponse;
import com.lettieri.application.notification.ApplicationNotification.repositories.NotificationTemplateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class NotificationTemplateService {

    NotificationTemplateRepository notificationTemplateRepository;

    public NotificationTemplateResponse getTemplate(NotificationTemplateRequest notificationTemplateRequest) {
        return notificationTemplateRepository.getTemplate(notificationTemplateRequest);
    }
}
