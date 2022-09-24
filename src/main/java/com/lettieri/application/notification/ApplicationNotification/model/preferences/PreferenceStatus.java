package com.lettieri.application.notification.ApplicationNotification.model.preferences;

public enum PreferenceStatus {
    SUCCESS("Notification Received Successfully");
    public final String message;
    private PreferenceStatus(String message) {
        this.message = message;
    }
}
