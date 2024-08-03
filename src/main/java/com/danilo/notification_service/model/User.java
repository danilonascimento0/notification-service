package com.danilo.notification_service.model;

import com.danilo.notification_service.model.enums.ChannelEnum;
import com.danilo.notification_service.model.enums.SubscriptionEnum;

import java.util.List;

public class User {

	private long id;
	private String name;
	private String email;
	private String phoneNumber;
	private List<SubscriptionEnum> subscripstionList;
	private List<ChannelEnum> channelEnumList;

	public User() { }

	public User(long id, String name, String email, String phoneNumber, List<SubscriptionEnum> subscripstionList, List<ChannelEnum> channelEnumList) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.subscripstionList = subscripstionList;
		this.channelEnumList = channelEnumList;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<SubscriptionEnum> getSubscripstionList() {
		return subscripstionList;
	}

	public void setSubscriptionList(List<SubscriptionEnum> subscripstionList) {
		this.subscripstionList = subscripstionList;
	}

	public List<ChannelEnum> getChannelList() {
		return channelEnumList;
	}

	public void setChannelList(List<ChannelEnum> channelEnumList) {
		this.channelEnumList = channelEnumList;
	}
}
