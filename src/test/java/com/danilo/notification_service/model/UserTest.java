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

		assertEquals(Constants.DEFAULT_LONG, user.getId());
		assertEquals(Constants.DEFAULT_NAME, user.getName());
		assertEquals(Constants.DEFAULT_EMAIL, user.getEmail());
		assertEquals(Constants.DEFAULT_PHONE_NUMBER, user.getPhoneNumber());
		assertTrue(user.getSubscripstionList().contains(Constants.DEFAULT_SUBSCRIPTION));
		assertTrue(user.getChannelList().contains(Constants.DEFAULT_CHANNEL));
	}
}
