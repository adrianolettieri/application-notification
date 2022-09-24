package com.lettieri.application.notification.ApplicationNotification.services;

import com.lettieri.application.notification.ApplicationNotification.model.preferences.NotificationPreferences;
import com.lettieri.application.notification.ApplicationNotification.model.NotificationRequest;
import com.lettieri.application.notification.ApplicationNotification.repositories.NotificationPreferencesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class NotificationPreferencesService {

    NotificationPreferencesRepository notificationPreferencesRepository;

    public NotificationPreferences getPreferences(NotificationRequest notificationRequest) {
        return notificationPreferencesRepository.getPreferences(notificationRequest.getCustomerId());
    }
}
