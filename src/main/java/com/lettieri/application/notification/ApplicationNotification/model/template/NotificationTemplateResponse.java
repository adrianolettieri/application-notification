package com.lettieri.application.notification.ApplicationNotification.model.template;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotificationTemplateResponse {
    String status;
    String statusDescription;
    String content;
}
