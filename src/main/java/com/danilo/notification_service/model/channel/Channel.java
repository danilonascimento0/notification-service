package com.danilo.notification_service.model.channel;

import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.SubscriptionEnum;
import com.danilo.notification_service.model.notification.Notification;

public abstract class Channel {

	public abstract Notification buildNotification(
			MessageDTO messageDTO,
			SubscriptionEnum subscriptionEnum,
			User user);

}
