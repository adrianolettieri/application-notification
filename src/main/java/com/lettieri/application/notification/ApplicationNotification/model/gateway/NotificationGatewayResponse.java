package com.lettieri.application.notification.ApplicationNotification.model.gateway;

import com.lettieri.application.notification.ApplicationNotification.entities.NotificationReference;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class NotificationGatewayResponse {
    String status;
    String statusDescription;
    String notificationReferenceId;
}
