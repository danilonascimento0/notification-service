package com.danilo.notification_service.service;

import com.danilo.notification_service.builder.Constants;
import com.danilo.notification_service.builder.MessageDTOBuilder;
import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.Channel;
import com.danilo.notification_service.model.enums.Subscription;
import com.danilo.notification_service.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@SpringBootTest
public class NotificationServiceTest {

	private UserRepository userRepository;
	private NotificationService notificationService;

	@BeforeEach
	public void setUp() {
		userRepository = Mockito.mock(UserRepository.class);
		notificationService = new NotificationService(userRepository);
	}

	@Test
	public void testSendEmailNotification() {
		// Arrange
		User mockUser = new User(1, "Danilo", "danilo@gmail.com", "1234567890",
				List.of(Subscription.SPORTS),
				List.of(Channel.EMAIL));
		when(userRepository.findBySubscription(Subscription.SPORTS)).thenReturn(List.of(mockUser));

		MessageDTO messageDTO = MessageDTOBuilder.buildMessageDTO();

		// Assert
		String expectedOutput = "Sending EMAIL to " + mockUser.getName() + " with message: " + messageDTO.getMessage();

		validateSendMessage(messageDTO, expectedOutput);
	}

	@Test
	public void testSendSMSNotification() {
		// Arrange
		User mockUser = new User(1, "Danilo", "danilo@gmail.com", "1234567890",
				List.of(Subscription.SPORTS),
				List.of(Channel.SMS));
		when(userRepository.findBySubscription(Subscription.SPORTS)).thenReturn(List.of(mockUser));

		MessageDTO messageDTO = MessageDTOBuilder.buildMessageDTO();

		// Assert
		String expectedOutput = "Sending SMS to " + mockUser.getName() + " with message: " + messageDTO.getMessage();

		validateSendMessage(messageDTO, expectedOutput);
	}

	private void validateSendMessage(MessageDTO messageDTO, String expectedOutput) {

		// Capture the output
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));

		// Act
		notificationService.sendNotification(messageDTO);

		System.setOut(originalOut);

		assertEquals(expectedOutput, outContent.toString());

		// Verify interactions
		verify(userRepository, times(1)).findBySubscription(Subscription.SPORTS);
	}

	@Test
	public void testSendNotificationThrowsIllegalArgumentException() {
		// Arrange
		MessageDTO invalidMessageDTO = new MessageDTO(Constants.DEFAULT_MESSAGE, "InvalidSubscription");

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			notificationService.sendNotification(invalidMessageDTO);
		});

		// Assert
		assertEquals("Invalid subscription: InvalidSubscription", exception.getMessage());
	}

}
