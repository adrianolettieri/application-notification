package com.lettieri.application.notification.ApplicationNotification.formatters;

import com.lettieri.application.notification.ApplicationNotification.entities.NotificationParametersItemEntity;
import com.lettieri.application.notification.ApplicationNotification.entities.NotificationPreferencesEntity;
import com.lettieri.application.notification.ApplicationNotification.entities.NotificationRequestEntity;
import com.lettieri.application.notification.ApplicationNotification.entities.NotificationTemplateEntity;
import com.lettieri.application.notification.ApplicationNotification.model.NotificationParameter;
import com.lettieri.application.notification.ApplicationNotification.model.NotificationRequest;
import com.lettieri.application.notification.ApplicationNotification.model.preferences.NotificationPreferences;
import com.lettieri.application.notification.ApplicationNotification.model.template.NotificationTemplateRequest;
import com.lettieri.application.notification.ApplicationNotification.model.template.NotificationTemplateResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface NotificationTemplateMapper {

    NotificationTemplateRequest toNotificationTemplateRequest(NotificationRequest notificationRequest);

    NotificationParametersItemEntity toNotificationParameterEntity(NotificationParameter notificationParameter);

    NotificationRequestEntity toNotificationRequestEntity(NotificationRequest request);

    NotificationPreferencesEntity toNotificationPreferencesEntity(NotificationPreferences notificationPreferences);

    NotificationTemplateEntity toNotificationTemplateEntity(NotificationTemplateResponse notificationTemplate);
}
