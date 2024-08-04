package com.danilo.notification_service.model.channel;

import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.User;

public class SMSChannel extends Channel {

	@Override
	public void send(MessageDTO messageDTO, User user) {
		// Code to send SMS
		System.out.print("Sending SMS to " + user.getName() + " with message: " + messageDTO.getMessage());
	}

}
