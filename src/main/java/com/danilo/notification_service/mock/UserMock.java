package com.danilo.notification_service.mock;

import com.danilo.notification_service.model.User;

import java.util.List;

public class UserMock {

	public static List<User> userList() {
		List<User> users = List.of(
				new User(1l, "Danilo", "danilo@email.com", "danilosNumber",
						List.of(Constants.MOCK_SUBSCRIPTION_SPORTS),
						List.of(Constants.MOCK_CHANNEL_EMAIL)),
				new User(2l, "Doe", "doe@email", "doesNumber",
						List.of(Constants.MOCK_SUBSCRIPTION_MOVIES),
						List.of(Constants.MOCK_CHANNEL_PUSH, Constants.MOCK_CHANNEL_SMS)),
				new User(3l, "Jazz", "jazz@email", "jazzNumber",
						List.of(Constants.MOCK_SUBSCRIPTION_MOVIES),
						List.of(Constants.MOCK_CHANNEL_PUSH, Constants.MOCK_CHANNEL_SMS))
				);
		return users;
	}
}
