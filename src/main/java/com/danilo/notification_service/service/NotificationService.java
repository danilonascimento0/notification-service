package com.danilo.notification_service.service;

import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.enums.ChannelEnum;
import com.danilo.notification_service.model.enums.SubscriptionEnum;
import com.danilo.notification_service.model.notification.EmailNotification;
import com.danilo.notification_service.model.notification.Notification;
import com.danilo.notification_service.model.notification.PushNotification;
import com.danilo.notification_service.model.notification.SMSNotification;
import com.danilo.notification_service.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

	UserRepository userRepository;

	public NotificationService(UserRepository userRepository){
		this.userRepository = userRepository;
	}

	public void sendNotification(MessageDTO messageDTO) {

		SubscriptionEnum subscriptionEnum = SubscriptionEnum.fromValue(messageDTO.getSubscription());

		if (subscriptionEnum == null) {
			throw new IllegalArgumentException("Invalid subscription: " + messageDTO.getSubscription());
		}

		List<Notification> notificationList = new ArrayList<>();

		this.userRepository.findBySubscription(subscriptionEnum).forEach(user -> {
			user.getChannelList().forEach(channel -> {
				if (channel.equals(ChannelEnum.EMAIL)) {
					notificationList.add(
							new EmailNotification(messageDTO.getMessage(), subscriptionEnum, user));
				}
				if (channel.equals(ChannelEnum.SMS)) {
					notificationList.add(
							new SMSNotification(messageDTO.getMessage(), subscriptionEnum, user));
				}
				if (channel.equals(ChannelEnum.PUSH_NOTIFICATION)) {
					notificationList.add(
							new PushNotification(messageDTO.getMessage(), subscriptionEnum, user));
				}
			});
		});

		notificationList.forEach(Notification::send);
	}

}
