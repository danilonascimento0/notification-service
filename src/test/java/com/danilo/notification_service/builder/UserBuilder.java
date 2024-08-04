package com.danilo.notification_service.builder;

import com.danilo.notification_service.model.User;

import java.util.List;

public class UserBuilder {

	public static User build() {
		return new User(ConstantsTest.DEFAULT_LONG,
				ConstantsTest.DEFAULT_NAME,
				ConstantsTest.DEFAULT_EMAIL,
				ConstantsTest.DEFAULT_PHONE_NUMBER,
				List.of(ConstantsTest.DEFAULT_SUBSCRIPTION_ENUM),
				List.of(ConstantsTest.DEFAULT_CHANNEL_ENUM));
	}

}
