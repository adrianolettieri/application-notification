package com.lettieri.application.notification.ApplicationNotification.model.template;

public enum NotificationTemplate {
    PhoneNumberChanged ("Your mobile phone is changed"), ViewBalance("Here's your balacnce");

    public final String message;

    private NotificationTemplate(String message) { this.message = message; }

}
