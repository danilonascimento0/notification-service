package com.danilo.notification_service.builder;

import com.danilo.notification_service.model.MessageDTO;

public class MessageDTOBuilder {

	public static MessageDTO buildMessageDTO() {
		return new MessageDTO(Constants.DEFAULT_MESSAGE, Constants.MOCK_SUBSCRIPTION_SPORTS);
	}

}
