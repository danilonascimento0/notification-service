package com.danilo.notification_service.model.notification;

import com.danilo.notification_service.model.User;

public class PushNotification extends Notification {
	public PushNotification(String message, String category, User user) {
		super(message, category, user);
	}

	@Override
	public void send() {
		// Code to send push notification
		System.out.println("Sending PUSH NOTIFICATION to " + user.getName() + " with message: " + message);
	}
}
