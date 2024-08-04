package com.danilo.notification_service.controller;

import com.danilo.notification_service.builder.Constants;
import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.service.NotificationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(NotificationController.class)
public class NotificationControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private NotificationService notificationService;

	private String messageContent;

	@BeforeEach
	public void setUp() {
		messageContent = "{\"message\":\""+ Constants.DEFAULT_MESSAGE +"\",\"subscription\":\""+Constants.DEFAULT_SUBSCRIPTION_ENUM+"\"}";
	}

	@Test
	public void testSendNotification_Success() throws Exception {
		doNothing().when(notificationService).sendNotification(any(MessageDTO.class));

		mockMvc.perform(post("/notifications/send")
						.contentType(MediaType.APPLICATION_JSON)
						.content(messageContent))
				.andExpect(status().isOk())
				.andExpect(content().string("Notification sent successfully"));

		verify(notificationService, times(1)).sendNotification(any(MessageDTO.class));
	}

	@Test
	public void testSendNotification_InvalidSubscription() throws Exception {
		doThrow(new IllegalArgumentException("Invalid subscription: Invalid")).when(notificationService).sendNotification(any(MessageDTO.class));

		mockMvc.perform(post("/notifications/send")
						.contentType(MediaType.APPLICATION_JSON)
						.content(messageContent))
				.andExpect(status().isBadRequest())
				.andExpect(content().string("Invalid subscription: Invalid"));

		verify(notificationService, times(1)).sendNotification(any(MessageDTO.class));
	}
}