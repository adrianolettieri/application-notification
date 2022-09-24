package com.lettieri.application.notification.ApplicationNotification.model.gateway;

import com.lettieri.application.notification.ApplicationNotification.model.NotificationMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class NotificationGatewayRequest {
    String customerId;
    NotificationMode notificationMode;
    String notificationContent;
    String emailAddress;
    String emailSubject;
    String phoneNumber;
}
