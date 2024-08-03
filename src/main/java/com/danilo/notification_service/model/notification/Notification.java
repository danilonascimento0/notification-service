package com.danilo.notification_service.model.notification;

import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.Subscription;

public abstract class Notification {
	protected String message;
	protected Subscription subscription;
	protected User user;

	public Notification(String message, Subscription subscription, User user) {
		this.message = message;
		this.subscription = subscription;
		this.user = user;
	}

	public abstract void send();

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
