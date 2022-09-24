package com.lettieri.application.notification.ApplicationNotification.repositories;

import com.lettieri.application.notification.ApplicationNotification.config.ServicesConfig;
import com.lettieri.application.notification.ApplicationNotification.model.preferences.NotificationPreferences;
import com.lettieri.application.notification.ApplicationNotification.model.preferences.NotificationPreferencesRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
@AllArgsConstructor
public class NotificationPreferencesRepository {
    RestTemplate restTemplate;
    ServicesConfig servicesConfig;

    public NotificationPreferences getPreferences(String customerId) {
        NotificationPreferencesRequest notificationPreferencesRequest = NotificationPreferencesRequest
                .builder().customerId(customerId).build();
        return this.restTemplate.postForObject(servicesConfig.getPreferenceServiceURL(),
                notificationPreferencesRequest, NotificationPreferences.class);
    }
}
