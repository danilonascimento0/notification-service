package com.danilo.notification_service.model.channel;

import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.User;

public class EmailChannel extends Channel {

	@Override
	public void send(MessageDTO messageDTO, User user) {
		// Code to send email
		System.out.print("Sending EMAIL to " + user.getName() + " with message: " + messageDTO.getMessage());
	}

}
