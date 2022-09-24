package com.lettieri.application.notification.ApplicationNotification.repositories;

import com.lettieri.application.notification.ApplicationNotification.config.ServicesConfig;
import com.lettieri.application.notification.ApplicationNotification.model.gateway.NotificationGatewayRequest;
import com.lettieri.application.notification.ApplicationNotification.model.gateway.NotificationGatewayResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
@AllArgsConstructor
public class NotificationGatewayRepository {
    RestTemplate restTemplate;
    ServicesConfig servicesConfig;

    public NotificationGatewayResponse send(NotificationGatewayRequest notificationGatewayRequest) {
        return this.restTemplate.postForObject(servicesConfig.getGatewayServiceURL(),
                notificationGatewayRequest, NotificationGatewayResponse.class);
    }
}
