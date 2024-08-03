package com.danilo.notification_service.model;

import com.danilo.notification_service.builder.Constants;
import com.danilo.notification_service.builder.NotificationBuilder;
import com.danilo.notification_service.model.notification.Notification;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class NotificationTest {

	@Test
	public void testSMSNotification() {
		Notification notification = NotificationBuilder.smsBuilder();

		assertEquals(Constants.DEFAULT_MESSAGE, notification.getMessage());
		assertEquals(Constants.DEFAULT_SUBSCRIPTION, notification.getSubscription());
		assertEquals(Constants.DEFAULT_EMAIL, notification.getUser().getEmail());
	}

	@Test
	public void testEmailNotificationCreation() {
		Notification emailNotification = NotificationBuilder.emailBuilder();

		assertEquals(Constants.DEFAULT_MESSAGE, emailNotification.getMessage());
		assertEquals(Constants.DEFAULT_SUBSCRIPTION, emailNotification.getSubscription());
		assertEquals(Constants.DEFAULT_EMAIL, emailNotification.getUser().getEmail());
	}

	@Test
	public void testPushNotificationCreation() {
		Notification emailNotification = NotificationBuilder.pushBuilder();

		assertEquals(Constants.DEFAULT_MESSAGE, emailNotification.getMessage());
		assertEquals(Constants.DEFAULT_SUBSCRIPTION, emailNotification.getSubscription());
		assertEquals(Constants.DEFAULT_EMAIL, emailNotification.getUser().getEmail());
	}

	private void validateSendMessage(Notification notification, String expectedMessage) {

		// Capture the output
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));

		notification.send();

		System.setOut(originalOut);

		assertEquals(
				expectedMessage,
				outContent.toString());

	}
}
