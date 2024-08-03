package com.danilo.notification_service.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserTest {

	private final long TEST_ID = 1;
	private final String TEST_NAME = "Danilo";
	private final String TEST_EMAIL = "danilo@gmail.com";
	private final String TEST_PHONE_NUMBER = "Danilo";
	private final String TEST_SUBSCRIPTION_SPORTS = "Sports";
	private final String TEST_SUBSCRIPTION_FINANCE = "Finance";
	private final String TEST_SUBSCRIPTION_MOVIES = "Movies";
	private final String TEST_CHANNEL_SMS = "SMS";
	private final String TEST_CHANNEL_EMAIL = "Email";
	private final String TEST_CHANNEL_PUSH = "Push";

	@Test
	public void testUserCreation() {
		User user = new User(TEST_ID,
				TEST_NAME,
				TEST_EMAIL,
				TEST_PHONE_NUMBER,
				List.of(TEST_SUBSCRIPTION_SPORTS, TEST_SUBSCRIPTION_FINANCE, TEST_SUBSCRIPTION_MOVIES),
				List.of(TEST_CHANNEL_SMS, TEST_CHANNEL_EMAIL, TEST_CHANNEL_PUSH));

		assertEquals(TEST_ID, user.getId());
		assertEquals(TEST_NAME, user.getName());
		assertEquals(TEST_EMAIL, user.getEmail());
		assertEquals(TEST_PHONE_NUMBER, user.getPhoneNumber());
		assertTrue(user.getSubscripstionList().contains(TEST_SUBSCRIPTION_SPORTS));
		assertTrue(user.getSubscripstionList().contains(TEST_SUBSCRIPTION_MOVIES));
		assertTrue(user.getChannelList().contains(TEST_CHANNEL_SMS));
		assertTrue(user.getChannelList().contains(TEST_CHANNEL_EMAIL));
	}
}
