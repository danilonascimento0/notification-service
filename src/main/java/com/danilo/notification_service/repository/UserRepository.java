package com.danilo.notification_service.repository;

import com.danilo.notification_service.mock.UserMock;
import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.Subscription;

import java.util.List;
import java.util.stream.Collectors;

//@Repository
//Simulating a repository
public class UserRepository {

	public List<User> findBySubscription(Subscription subscription) {
		return UserMock.userList().stream()
				.filter(user -> user.getSubscripstionList().contains(subscription))
				.collect(Collectors.toList());
	}
}
