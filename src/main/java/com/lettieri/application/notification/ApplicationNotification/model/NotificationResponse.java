package com.lettieri.application.notification.ApplicationNotification.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NotificationResponse {
    String status;
    String statusDescription;
    int notificationReferenceId;
}
