package com.danilo.notification_service.model.channel;

import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.SubscriptionEnum;
import com.danilo.notification_service.model.notification.Notification;
import com.danilo.notification_service.model.notification.PushNotification;

public class PushChannel extends Channel {

	@Override
	public Notification buildNotification(MessageDTO messageDTO, SubscriptionEnum subscriptionEnum, User user) {
		return new PushNotification(messageDTO.getMessage(), subscriptionEnum, user);
	}

}
