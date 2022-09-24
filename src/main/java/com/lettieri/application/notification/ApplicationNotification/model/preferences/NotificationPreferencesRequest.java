package com.lettieri.application.notification.ApplicationNotification.model.preferences;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotificationPreferencesRequest {
    String customerId;
}
