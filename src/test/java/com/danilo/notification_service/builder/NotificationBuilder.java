package com.danilo.notification_service.builder;

import com.danilo.notification_service.model.notification.EmailNotification;
import com.danilo.notification_service.model.notification.PushNotification;
import com.danilo.notification_service.model.notification.SMSNotification;

public class NotificationBuilder {

	public static SMSNotification smsBuilder() {
		return new SMSNotification(Constants.DEFAULT_MESSAGE,
				Constants.DEFAULT_SUBSCRIPTION,
				UserBuilder.builder());
	}

	public static EmailNotification emailBuilder() {
		return new EmailNotification(Constants.DEFAULT_MESSAGE,
				Constants.DEFAULT_SUBSCRIPTION,
				UserBuilder.builder());
	}

	public static PushNotification pushBuilder() {
		return new PushNotification(Constants.DEFAULT_MESSAGE,
				Constants.DEFAULT_SUBSCRIPTION,
				UserBuilder.builder());
	}

}
