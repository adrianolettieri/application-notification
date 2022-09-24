package com.lettieri.application.notification.ApplicationNotification.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name="NOTIFICATION_PARAMETERS_ITEM")
@AllArgsConstructor
@NoArgsConstructor
public class NotificationParametersItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    String notificationParameterName;
    @Column
    String notificationParameterValue;

    @ManyToOne
    @JoinColumn(name = "notification_request_id")
    NotificationRequestEntity notificationRequest;
}
