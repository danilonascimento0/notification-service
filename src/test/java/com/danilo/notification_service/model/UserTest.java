package com.danilo.notification_service.model;

import com.danilo.notification_service.builder.ConstantsTest;
import com.danilo.notification_service.builder.UserBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserTest {

	@Test
	public void testUserCreation() {
		User user = UserBuilder.build();

		assertEquals(ConstantsTest.DEFAULT_LONG, user.getId());
		assertEquals(ConstantsTest.DEFAULT_NAME, user.getName());
		assertEquals(ConstantsTest.DEFAULT_EMAIL, user.getEmail());
		assertEquals(ConstantsTest.DEFAULT_PHONE_NUMBER, user.getPhoneNumber());
		assertTrue(user.getSubscripstionList().contains(ConstantsTest.DEFAULT_SUBSCRIPTION_ENUM));
		assertTrue(user.getChannelList().contains(ConstantsTest.DEFAULT_CHANNEL_ENUM));
	}
}
