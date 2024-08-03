package com.danilo.notification_service.service;

import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.notification.EmailNotification;
import com.danilo.notification_service.model.notification.Notification;
import com.danilo.notification_service.repository.UserRepository;

public class NotificationService {

	UserRepository userRepository;

	public NotificationService(UserRepository userRepository){
		this.userRepository = userRepository;
	}

	public void sendNotification(MessageDTO messageDTO) {

		this.userRepository.findBySubscription(messageDTO.getSubscription()).forEach(user -> {
			user.getChannelList().forEach(channel -> {
				if (channel.equals("Email")) {
					Notification notification = new EmailNotification(messageDTO.getMessage(), messageDTO.getSubscription(), user);
					notification.send();
				}
			});
		});

	}

}
