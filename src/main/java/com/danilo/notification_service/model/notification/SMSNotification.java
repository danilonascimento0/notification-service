package com.danilo.notification_service.model.notification;

import com.danilo.notification_service.model.User;

public class SMSNotification extends Notification {

	public SMSNotification(String message, String category, User user) {
		super(message, category, user);
	}

	@Override
	public void send() {
		// Code to send SMS
		System.out.println("Sending SMS to " + user.getName() + " with message: " + message);
	}

}
