package com.lettieri.application.notification.ApplicationNotification.entities;

import com.lettieri.application.notification.ApplicationNotification.model.NotificationRequest;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name="NOTIFICATION_REFERENCES")
@AllArgsConstructor
@NoArgsConstructor
public class NotificationReference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "notification_request_id")
    NotificationRequestEntity notificationRequest;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "notification_preferences_status")
    NotificationPreferencesEntity notificationPreferences;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "notification_template_id")
    NotificationTemplateEntity notificationTemplate;
}
