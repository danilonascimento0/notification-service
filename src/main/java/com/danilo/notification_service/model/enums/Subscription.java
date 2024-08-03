package com.danilo.notification_service.model.enums;

public enum Subscription {

	SPORTS("Sports"),
	FINANCE("Finance"),
	MOVIES("Movies");

	private String value;

	Subscription(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static Subscription fromValue(String value) {
		for (Subscription subscription : Subscription.values()) {
			if (subscription.getValue().equals(value)) {
				return subscription;
			}
		}
		return null;
	}

}
