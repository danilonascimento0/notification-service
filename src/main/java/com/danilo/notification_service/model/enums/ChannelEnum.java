package com.danilo.notification_service.model.enums;

import com.danilo.notification_service.model.channel.Channel;
import com.danilo.notification_service.model.channel.EmailChannel;
import com.danilo.notification_service.model.channel.PushChannel;
import com.danilo.notification_service.model.channel.SMSChannel;

public enum ChannelEnum {
	EMAIL(new EmailChannel()),
	SMS(new SMSChannel()),
	PUSH_NOTIFICATION(new PushChannel());

	private final Channel channel;

	ChannelEnum(Channel channel) {
		this.channel = channel;
	}

	public Channel getChannel() {
		return channel;
	}

}
