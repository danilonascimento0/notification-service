package com.danilo.notification_service.mock;

import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.Channel;
import com.danilo.notification_service.model.enums.Subscription;

import java.util.List;

public class UserMock {

	public static List<User> userList() {
		List<User> users = List.of(
				new User(1l, "Danilo", "danilo@email.com", "danilosNumber",
						List.of(Subscription.SPORTS),
						List.of(Channel.EMAIL)),
				new User(2l, "Doe", "doe@email", "doesNumber",
						List.of(Subscription.MOVIES),
						List.of(Channel.PUSH_NOTIFICATION, Channel.SMS)),
				new User(3l, "Jazz", "jazz@email", "jazzNumber",
						List.of(Subscription.MOVIES, Subscription.FINANCE),
						List.of(Channel.EMAIL, Channel.SMS))
				);
		return users;
	}
}
