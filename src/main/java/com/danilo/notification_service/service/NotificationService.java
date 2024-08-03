package com.danilo.notification_service.service;

import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.enums.Channel;
import com.danilo.notification_service.model.enums.Subscription;
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

		Subscription subscription = Subscription.fromValue(messageDTO.getSubscription());

		if (subscription == null) {
			throw new IllegalArgumentException("Invalid subscription: " + messageDTO.getSubscription());
		}

		List<Notification> notificationList = new ArrayList<>();

		this.userRepository.findBySubscription(subscription).forEach(user -> {
			user.getChannelList().forEach(channel -> {
				if (channel.equals(Channel.EMAIL)) {
					notificationList.add(
							new EmailNotification(messageDTO.getMessage(), subscription, user));
				}
				if (channel.equals(Channel.SMS)) {
					notificationList.add(
							new SMSNotification(messageDTO.getMessage(), subscription, user));
				}
				if (channel.equals(Channel.PUSH_NOTIFICATION)) {
					notificationList.add(
							new PushNotification(messageDTO.getMessage(), subscription, user));
				}
			});
		});

		notificationList.forEach(Notification::send);
	}

}
