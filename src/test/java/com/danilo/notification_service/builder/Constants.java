package com.danilo.notification_service.builder;

import com.danilo.notification_service.model.enums.ChannelEnum;
import com.danilo.notification_service.model.enums.SubscriptionEnum;

public class Constants<T> {

	// Default values
	public final static long DEFAULT_LONG = 1;
	public final static String DEFAULT_NAME = "Test Name";
	public final static String DEFAULT_EMAIL = "testname@gmail.com";
	public final static String DEFAULT_PHONE_NUMBER = "+1234567890";
	public final static SubscriptionEnum DEFAULT_SUBSCRIPTION_ENUM = SubscriptionEnum.SPORTS;
	public final static ChannelEnum DEFAULT_CHANNEL_ENUM = ChannelEnum.EMAIL;
	public final static String DEFAULT_MESSAGE = "Test Message";

}
