package com.danilo.notification_service.builder;

import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.enums.SubscriptionEnum;

public class MessageDTOBuilder {

	public static MessageDTO build() {
		return new MessageDTO(ConstantsTest.DEFAULT_MESSAGE, SubscriptionEnum.SPORTS.getValue());
	}

}
