package com.lettieri.application.notification.ApplicationNotification.model.preferences;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationPreferences {
    private PreferenceStatus status;
    private String statusDescription;
    private Boolean smsPreferenceFlag;
    private Boolean emailPreferenceFlag;
    private String emailAddress;
    private String phoneNumber;
}
