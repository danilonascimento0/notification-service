package com.danilo.notification_service.model.notification;

import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.Subscription;

public class PushNotification extends Notification {
	public PushNotification(String message, Subscription subscription, User user) {
		super(message, subscription, user);
	}

	@Override
	public void send() {
		// Code to send push notification
		System.out.print("Sending PUSH NOTIFICATION to " + user.getName() + " with message: " + message);
	}
}
