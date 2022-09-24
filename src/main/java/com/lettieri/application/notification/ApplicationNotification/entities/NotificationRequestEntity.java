package com.lettieri.application.notification.ApplicationNotification.entities;

import com.lettieri.application.notification.ApplicationNotification.model.NotificationMode;
import com.lettieri.application.notification.ApplicationNotification.model.template.NotificationTemplate;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name="NOTIFICATION_REQUESTS")
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    String customerId;
    @Column
    NotificationMode notificationMode;
    @OneToMany(cascade = CascadeType.ALL)
    List<NotificationParametersItemEntity> notificationParameters;
    @Column
    NotificationTemplate notificationTemplateName;
}
