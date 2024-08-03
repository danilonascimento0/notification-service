package com.danilo.notification_service.model.enums;

public enum SubscriptionEnum {

	SPORTS("Sports"),
	FINANCE("Finance"),
	MOVIES("Movies");

	private String value;

	SubscriptionEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static SubscriptionEnum fromValue(String value) {
		for (SubscriptionEnum subscriptionEnum : SubscriptionEnum.values()) {
			if (subscriptionEnum.getValue().equals(value)) {
				return subscriptionEnum;
			}
		}
		return null;
	}

}
