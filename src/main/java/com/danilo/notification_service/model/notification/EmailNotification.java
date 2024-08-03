package com.danilo.notification_service.model.notification;

import com.danilo.notification_service.model.User;

public class EmailNotification extends Notification {

	public EmailNotification(String message, String category, User user) {
		super(message, category, user);
	}

	@Override
	public void send() {
		// Code to send email
		System.out.println("Sending EMAIL to " + user.getName() + " with message: " + message);
	}

}
