package com.danilo.notification_service.model;

import com.danilo.notification_service.model.enums.Subscription;

public class MessageDTO {

	String message;
	Subscription subscription;

	public MessageDTO(String message, Subscription subscription) {
		this.message = message;
		this.subscription = subscription;
	}

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

}
