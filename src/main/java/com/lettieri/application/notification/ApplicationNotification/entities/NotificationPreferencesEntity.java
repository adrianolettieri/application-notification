package com.lettieri.application.notification.ApplicationNotification.entities;

import com.lettieri.application.notification.ApplicationNotification.model.preferences.PreferenceStatus;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name="NOTIFICATION_PREFERENCES")
@AllArgsConstructor
@NoArgsConstructor
public class NotificationPreferencesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private PreferenceStatus status;
    @Column
    private String statusDescription;
    @Column
    private Boolean smsPreferenceFlag;
    @Column
    private Boolean emailPreferenceFlag;
    @Column
    private String emailAddress;
    @Column
    private String phoneNumber;
}
