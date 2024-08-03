package com.danilo.notification_service.model.notification;

import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.Subscription;

public class EmailNotification extends Notification {

	public EmailNotification(String message, Subscription subscription, User user) {
		super(message, subscription, user);
	}

	@Override
	public void send() {
		// Code to send email
		System.out.print("Sending EMAIL to " + user.getName() + " with message: " + message);
	}

}
