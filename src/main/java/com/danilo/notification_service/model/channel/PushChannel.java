package com.danilo.notification_service.model.channel;

import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.User;

public class PushChannel extends Channel {

	@Override
	public void send(MessageDTO messageDTO, User user) {
		// Code to send push notification
		System.out.print("Sending PUSH NOTIFICATION to " + user.getName() + " with message: " + messageDTO.getMessage());
	}

}
