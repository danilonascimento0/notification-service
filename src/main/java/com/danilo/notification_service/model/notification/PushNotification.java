package com.danilo.notification_service.model.notification;

import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.SubscriptionEnum;

public class PushNotification extends Notification {
	public PushNotification(String message, SubscriptionEnum subscriptionEnum, User user) {
		super(message, subscriptionEnum, user);
	}

	@Override
	public void send() {
		// Code to send push notification
		System.out.print("Sending PUSH NOTIFICATION to " + user.getName() + " with message: " + message);
	}
}
