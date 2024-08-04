package com.danilo.notification_service.model.channel;

import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.User;

public abstract class Channel {

	public abstract void send(MessageDTO messageDTO, User user);

}
