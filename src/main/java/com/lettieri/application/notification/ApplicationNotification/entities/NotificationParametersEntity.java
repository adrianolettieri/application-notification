package com.lettieri.application.notification.ApplicationNotification.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name="NOTIFICATION_PARAMETERS")
@AllArgsConstructor
@NoArgsConstructor
public class NotificationParametersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    List<NotificationParametersItemEntity> notificationParameters;
}
