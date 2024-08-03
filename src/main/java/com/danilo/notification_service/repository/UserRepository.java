package com.danilo.notification_service.repository;

import com.danilo.notification_service.mock.UserMock;
import com.danilo.notification_service.model.User;

import java.util.List;
import java.util.stream.Collectors;

//@Repository
//Simulating a repository
public class UserRepository {

	public List<User> findBySubscription(String subscription) {
		return UserMock.userList().stream()
				.filter(user -> user.getSubscripstionList().contains(subscription))
				.collect(Collectors.toList());
	}
}
