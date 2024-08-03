package com.danilo.notification_service.model.notification;

import com.danilo.notification_service.model.User;

public abstract class Notification {
	protected String message;
	protected String category;
	protected User user;

	public Notification(String message, String category, User user) {
		this.message = message;
		this.category = category;
		this.user = user;
	}

	public abstract void send();
}
