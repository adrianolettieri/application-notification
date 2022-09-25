package com.lettieri.application.notification.ApplicationNotification.repositories;

import com.lettieri.application.notification.ApplicationNotification.config.ServicesConfig;
import com.lettieri.application.notification.ApplicationNotification.model.template.NotificationTemplateRequest;
import com.lettieri.application.notification.ApplicationNotification.model.template.NotificationTemplateResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
@AllArgsConstructor
public class NotificationTemplateRepository {
    RestTemplate restTemplate;
    ServicesConfig servicesConfig;

    final String notificationTemplateUrl = "http://NotificationTemplateFormatterService/api/notifications/templates";


    public NotificationTemplateResponse getTemplate(NotificationTemplateRequest notificationTemplateRequest) {
        return this.restTemplate.postForObject(notificationTemplateUrl,
                notificationTemplateRequest, NotificationTemplateResponse.class);
    }
}
