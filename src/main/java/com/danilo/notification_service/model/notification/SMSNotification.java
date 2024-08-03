package com.danilo.notification_service.model.notification;

import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.Subscription;

public class SMSNotification extends Notification {

	public SMSNotification(String message, Subscription subscription, User user) {
		super(message, subscription, user);
	}

	@Override
	public void send() {
		// Code to send SMS
		System.out.print("Sending SMS to " + user.getName() + " with message: " + message);
	}

}
