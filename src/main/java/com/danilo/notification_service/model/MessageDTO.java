package com.danilo.notification_service.model;

public class MessageDTO {

	String message;
	String subscription;

	public MessageDTO(String message, String subscription) {
		this.message = message;
		this.subscription = subscription;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubscription() {
		return subscription;
	}

	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}

}
