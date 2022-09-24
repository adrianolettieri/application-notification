package com.lettieri.application.notification.ApplicationNotification.model;

import com.lettieri.application.notification.ApplicationNotification.model.template.NotificationTemplate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class NotificationRequest {
    String customerId;
    NotificationMode notificationMode;
    List<NotificationParameter> notificationParameters;
    NotificationTemplate notificationTemplateName;

}
