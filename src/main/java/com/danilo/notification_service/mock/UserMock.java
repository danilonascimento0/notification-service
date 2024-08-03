package com.danilo.notification_service.mock;

import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.ChannelEnum;
import com.danilo.notification_service.model.enums.SubscriptionEnum;

import java.util.List;

public class UserMock {

	public static List<User> userList() {
		List<User> users = List.of(
				new User(1l, "Danilo", "danilo@email.com", "danilosNumber",
						List.of(SubscriptionEnum.SPORTS),
						List.of(ChannelEnum.EMAIL)),
				new User(2l, "Doe", "doe@email", "doesNumber",
						List.of(SubscriptionEnum.MOVIES),
						List.of(ChannelEnum.PUSH_NOTIFICATION, ChannelEnum.SMS)),
				new User(3l, "Jazz", "jazz@email", "jazzNumber",
						List.of(SubscriptionEnum.MOVIES, SubscriptionEnum.FINANCE),
						List.of(ChannelEnum.EMAIL, ChannelEnum.SMS))
				);
		return users;
	}
}
