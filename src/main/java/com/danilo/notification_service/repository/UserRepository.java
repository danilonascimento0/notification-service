package com.danilo.notification_service.repository;

import com.danilo.notification_service.mock.UserMock;
import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.SubscriptionEnum;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
//Simulating a repository
public class UserRepository {

	public List<User> findBySubscription(SubscriptionEnum subscriptionEnum) {
		return UserMock.userList().stream()
				.filter(user -> user.getSubscripstionList().contains(subscriptionEnum))
				.collect(Collectors.toList());
	}
}
