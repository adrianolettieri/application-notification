package com.lettieri.application.notification.ApplicationNotification.services;

import com.lettieri.application.notification.ApplicationNotification.entities.NotificationReference;
import com.lettieri.application.notification.ApplicationNotification.repositories.NotificationReferenceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class NotificationReferenceService {
    private final NotificationReferenceRepository notificationReferenceRepository;

    public NotificationReference save(NotificationReference notificationReference) {
        return notificationReferenceRepository.save(notificationReference);
    }
}
