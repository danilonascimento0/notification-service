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

		String expectedMessage =
				"Sending SMS to " +
				Constants.DEFAULT_NAME +
				" with message: " +
				Constants.DEFAULT_MESSAGE;

		validateSendMessage(notification, expectedMessage);
	}

	@Test
	public void testEmailNotificationCreation() {
		Notification emailNotification = NotificationBuilder.emailBuilder();

		assertEquals(Constants.DEFAULT_MESSAGE, emailNotification.getMessage());
		assertEquals(Constants.DEFAULT_SUBSCRIPTION, emailNotification.getSubscription());
		assertEquals(Constants.DEFAULT_EMAIL, emailNotification.getUser().getEmail());

		String expectedMessage =
				"Sending EMAIL to " +
						Constants.DEFAULT_NAME +
						" with message: " +
						Constants.DEFAULT_MESSAGE;

		validateSendMessage(emailNotification, expectedMessage);
	}

	@Test
	public void testPushNotificationCreation() {
		Notification pushNotification = NotificationBuilder.pushBuilder();

		assertEquals(Constants.DEFAULT_MESSAGE, pushNotification.getMessage());
		assertEquals(Constants.DEFAULT_SUBSCRIPTION, pushNotification.getSubscription());
		assertEquals(Constants.DEFAULT_EMAIL, pushNotification.getUser().getEmail());

		String expectedMessage =
				"Sending PUSH NOTIFICATION to " +
						Constants.DEFAULT_NAME +
						" with message: " +
						Constants.DEFAULT_MESSAGE;

		validateSendMessage(pushNotification, expectedMessage);
	}

	private void validateSendMessage(Notification notification, String expectedOutput) {

		// Capture the output
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));

		notification.send();

		System.setOut(originalOut);

		assertEquals(
				expectedOutput,
				outContent.toString());
	}
}
