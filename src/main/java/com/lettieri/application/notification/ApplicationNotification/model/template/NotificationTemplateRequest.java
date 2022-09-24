package com.lettieri.application.notification.ApplicationNotification.model.template;

import com.lettieri.application.notification.ApplicationNotification.model.NotificationMode;
import com.lettieri.application.notification.ApplicationNotification.model.NotificationParameter;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotificationTemplateRequest {
    NotificationTemplate notificationTemplateName;
    NotificationMode notificationMode;
    List<NotificationParameter> notificationParameters;
}
