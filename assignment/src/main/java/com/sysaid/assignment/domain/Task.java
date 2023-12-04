package com.sysaid.assignment.domain;

import java.io.Serializable;

public class Task implements Serializable {

	private static final long serialVersionUID = 4L;

	private String activity;
	private Float accessibility;
	private String type;
	private Integer participants;
	private Float price;
	private String link;
	private String key;
	private String user;
    private int rating;
	private boolean wishList;
	private boolean completed;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public Float getAccessibility() {
		return accessibility;
	}

	public void setAccessibility(Float accessibility) {
		this.accessibility = accessibility;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getParticipants() {
		return participants;
	}

	public void setParticipants(Integer participants) {
		this.participants = participants;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public boolean isWishList() {
		return wishList;
	}

	public void setWishList(boolean wishList) {
		this.wishList = wishList;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}

