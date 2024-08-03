package com.danilo.notification_service.model;

import com.danilo.notification_service.builder.Constants;
import com.danilo.notification_service.builder.UserBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserTest {

	@Test
	public void testUserCreation() {
		User user = UserBuilder.builder();

		assertEquals(Constants.TEST_LONG, user.getId());
		assertEquals(Constants.TEST_NAME, user.getName());
		assertEquals(Constants.TEST_EMAIL, user.getEmail());
		assertEquals(Constants.TEST_PHONE_NUMBER, user.getPhoneNumber());
		assertTrue(user.getSubscripstionList().contains(Constants.TEST_SUBSCRIPTION_SPORTS));
		assertTrue(user.getSubscripstionList().contains(Constants.TEST_SUBSCRIPTION_MOVIES));
		assertTrue(user.getChannelList().contains(Constants.TEST_CHANNEL_SMS));
		assertTrue(user.getChannelList().contains(Constants.TEST_CHANNEL_EMAIL));
	}
}
