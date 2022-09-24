package com.lettieri.application.notification.ApplicationNotification.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Configuration
public class ServicesConfig {

    @Value("${notifications.preferenceServiceURL}")
    String preferenceServiceURL;

    @Value("${notifications.templateServiceURL}")
    String templateServiceURL;

    @Value("${notifications.gatewayServiceURL}")
    String gatewayServiceURL;
}
