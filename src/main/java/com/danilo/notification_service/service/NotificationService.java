package com.danilo.notification_service.service;

import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.enums.SubscriptionEnum;
import com.danilo.notification_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	private final UserRepository userRepository;

	@Autowired
	public NotificationService(UserRepository userRepository){
		this.userRepository = userRepository;
	}

	public void sendNotification(MessageDTO messageDTO) {

		SubscriptionEnum subscriptionEnum = SubscriptionEnum.fromValue(messageDTO.getSubscription());

		if (subscriptionEnum == null) {
			throw new IllegalArgumentException("Invalid subscription: " + messageDTO.getSubscription());
		}

		this.userRepository.findBySubscription(subscriptionEnum).forEach(user -> {
			user.getChannelList().forEach(channelEnum -> channelEnum.getChannel().send(messageDTO, user));
		});
	}

}
