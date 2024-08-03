package com.danilo.notification_service.builder;

import com.danilo.notification_service.model.User;

import java.util.List;

public class UserBuilder {

	public static User builder() {
		return new User(Constants.TEST_LONG,
				Constants.TEST_NAME,
				Constants.TEST_EMAIL,
				Constants.TEST_PHONE_NUMBER,
				List.of(Constants.TEST_SUBSCRIPTION_SPORTS, Constants.TEST_SUBSCRIPTION_FINANCE, Constants.TEST_SUBSCRIPTION_MOVIES),
				List.of(Constants.TEST_CHANNEL_SMS, Constants.TEST_CHANNEL_EMAIL, Constants.TEST_CHANNEL_PUSH));
	}

}
