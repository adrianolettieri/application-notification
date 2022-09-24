package com.lettieri.application.notification.ApplicationNotification.repositories;

import com.lettieri.application.notification.ApplicationNotification.entities.NotificationReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NotificationReferenceRepository extends JpaRepository<NotificationReference, UUID> {

}
