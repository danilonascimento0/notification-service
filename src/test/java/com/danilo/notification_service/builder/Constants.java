package com.danilo.notification_service.builder;

import com.danilo.notification_service.model.enums.Channel;
import com.danilo.notification_service.model.enums.Subscription;

public class Constants<T> {

	// Default values
	public final static long DEFAULT_LONG = 1;
	public final static String DEFAULT_NAME = "Test Name";
	public final static String DEFAULT_EMAIL = "testname@gmail.com";
	public final static String DEFAULT_PHONE_NUMBER = "+1234567890";
	public final static Subscription DEFAULT_SUBSCRIPTION = Subscription.SPORTS;
	public final static Channel DEFAULT_CHANNEL = Channel.EMAIL;
	public final static String DEFAULT_MESSAGE = "Test Message";

}
