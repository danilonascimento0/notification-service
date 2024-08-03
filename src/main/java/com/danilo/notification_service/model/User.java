package com.danilo.notification_service.model;

import com.danilo.notification_service.model.enums.Channel;

import java.util.List;

public class User {

	private long id;
	private String name;
	private String email;
	private String phoneNumber;
	private List<String> subscripstionList;
	private List<Channel> channelList;

	public User() { }

	public User(long id, String name, String email, String phoneNumber, List<String> subscripstionList, List<Channel> channelList) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.subscripstionList = subscripstionList;
		this.channelList = channelList;
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

	public List<String> getSubscripstionList() {
		return subscripstionList;
	}

	public void setSubscripstionList(List<String> subscripstionList) {
		this.subscripstionList = subscripstionList;
	}

	public List<Channel> getChannelList() {
		return channelList;
	}

	public void setChannelList(List<Channel> channelList) {
		this.channelList = channelList;
	}
}
