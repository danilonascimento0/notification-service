package com.danilo.notification_service.model.notification;

import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.SubscriptionEnum;

public class EmailNotification extends Notification {

	public EmailNotification(String message, SubscriptionEnum subscriptionEnum, User user) {
		super(message, subscriptionEnum, user);
	}

	@Override
	public void send() {
		// Code to send email
		System.out.print("Sending EMAIL to " + user.getName() + " with message: " + message);
	}

}
