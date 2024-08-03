package com.danilo.notification_service.builder;

import com.danilo.notification_service.model.User;

import java.util.List;

public class UserBuilder {

	public static User builder() {
		return new User(Constants.DEFAULT_LONG,
				Constants.DEFAULT_NAME,
				Constants.DEFAULT_EMAIL,
				Constants.DEFAULT_PHONE_NUMBER,
				List.of(Constants.DEFAULT_SUBSCRIPTION_ENUM),
				List.of(Constants.DEFAULT_CHANNEL_ENUM));
	}

}
