package com.danilo.notification_service.model.notification;

import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.SubscriptionEnum;

public class SMSNotification extends Notification {

	public SMSNotification(String message, SubscriptionEnum subscriptionEnum, User user) {
		super(message, subscriptionEnum, user);
	}

	@Override
	public void send() {
		// Code to send SMS
		System.out.print("Sending SMS to " + user.getName() + " with message: " + message);
	}

}
