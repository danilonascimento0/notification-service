package com.danilo.notification_service.model;

import com.danilo.notification_service.builder.ConstantsTest;
import com.danilo.notification_service.builder.MessageDTOBuilder;
import com.danilo.notification_service.builder.UserBuilder;
import com.danilo.notification_service.model.channel.Channel;
import com.danilo.notification_service.model.enums.ChannelEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ChannelTest {

	@Test
	public void testSMSChannel() {
		Channel channel = ChannelEnum.SMS.getChannel();

		String expectedMessage =
				"Sending SMS to " +
				ConstantsTest.DEFAULT_NAME +
				" with message: " +
				ConstantsTest.DEFAULT_MESSAGE;

		validateSendMessage(channel, expectedMessage);
	}

	@Test
	public void testEmailNotificationCreation() {
		Channel channel = ChannelEnum.EMAIL.getChannel();

		String expectedMessage =
				"Sending EMAIL to " +
						ConstantsTest.DEFAULT_NAME +
						" with message: " +
						ConstantsTest.DEFAULT_MESSAGE;

		validateSendMessage(channel, expectedMessage);
	}

	@Test
	public void testPushNotificationCreation() {
		Channel channel = ChannelEnum.PUSH_NOTIFICATION.getChannel();

		String expectedMessage =
				"Sending PUSH NOTIFICATION to " +
						ConstantsTest.DEFAULT_NAME +
						" with message: " +
						ConstantsTest.DEFAULT_MESSAGE;

		validateSendMessage(channel, expectedMessage);
	}

	private void validateSendMessage(Channel channel, String expectedOutput) {

		// Capture the output
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));

		channel.send(MessageDTOBuilder.build(), UserBuilder.build());

		System.setOut(originalOut);

		assertEquals(
				expectedOutput,
				outContent.toString());
	}
}
