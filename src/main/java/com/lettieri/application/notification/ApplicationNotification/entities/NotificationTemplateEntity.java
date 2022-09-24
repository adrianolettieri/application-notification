package com.lettieri.application.notification.ApplicationNotification.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name="NOTIFICATION_TEMPLATES")
@AllArgsConstructor
@NoArgsConstructor
public class NotificationTemplateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    String status;
    @Column
    String statusDescription;
    @Column(columnDefinition="TEXT")
    String content;
}
