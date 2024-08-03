package com.danilo.notification_service.service;

import com.danilo.notification_service.builder.Constants;
import com.danilo.notification_service.builder.MessageDTOBuilder;
import com.danilo.notification_service.model.MessageDTO;
import com.danilo.notification_service.model.User;
import com.danilo.notification_service.model.enums.Channel;
import com.danilo.notification_service.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
				List.of(Constants.MOCK_SUBSCRIPTION_SPORTS),
				List.of(Channel.EMAIL));
		when(userRepository.findBySubscription(Constants.MOCK_SUBSCRIPTION_SPORTS)).thenReturn(List.of(mockUser));

		MessageDTO messageDTO = MessageDTOBuilder.buildMessageDTO();

		// Capture the output
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));

		// Act
		notificationService.sendNotification(messageDTO);

		// Restore the original System.out
		System.setOut(originalOut);

		// Assert
		String expectedOutput = "Sending EMAIL to " + mockUser.getName() + " with message: " + messageDTO.getMessage();
		String actualOutput = outContent.toString();

		assertEquals(expectedOutput, actualOutput);

		// Verify interactions
		verify(userRepository, times(1)).findBySubscription(Constants.MOCK_SUBSCRIPTION_SPORTS);
	}

}
