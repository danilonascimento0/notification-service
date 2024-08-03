package com.danilo.notification_service.builder;

import com.danilo.notification_service.model.enums.Channel;

public class Constants<T> {

	// Default values
	public final static long DEFAULT_LONG = 1;
	public final static String DEFAULT_NAME = "Test Name";
	public final static String DEFAULT_EMAIL = "testname@gmail.com";
	public final static String DEFAULT_PHONE_NUMBER = "+1234567890";
	public final static String DEFAULT_SUBSCRIPTION = "SUBSCRIPTION";
	public final static Channel DEFAULT_CHANNEL = Channel.EMAIL;
	public final static String DEFAULT_MESSAGE = "Test Message";

	// MOCK values
	public final static String MOCK_SUBSCRIPTION_SPORTS = "Sports";
	public final static String MOCK_SUBSCRIPTION_FINANCE = "Finance";
	public final static String MOCK_SUBSCRIPTION_MOVIES = "Movies";

}
