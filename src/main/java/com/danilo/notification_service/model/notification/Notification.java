package com.danilo.notification_service.model.notification;

import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.SubscriptionEnum;

public abstract class Notification {
	protected String message;
	protected SubscriptionEnum subscriptionEnum;
	protected User user;

	public Notification(String message, SubscriptionEnum subscriptionEnum, User user) {
		this.message = message;
		this.subscriptionEnum = subscriptionEnum;
		this.user = user;
	}

	public abstract void send();

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public SubscriptionEnum getSubscription() {
		return subscriptionEnum;
	}

	public void setSubscription(SubscriptionEnum subscriptionEnum) {
		this.subscriptionEnum = subscriptionEnum;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
