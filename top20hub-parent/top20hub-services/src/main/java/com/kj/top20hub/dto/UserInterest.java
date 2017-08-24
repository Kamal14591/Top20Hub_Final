package com.kj.top20hub.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_interest")
public class UserInterest {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_interest_id;

	@Column
	private String interest_desc;

	public int getUser_interest_id() {
		return user_interest_id;
	}

	public void setUser_interest_id(int user_interest_id) {
		this.user_interest_id = user_interest_id;
	}

	public String getInterest_desc() {
		return interest_desc;
	}

	public void setInterest_desc(String interest_desc) {
		this.interest_desc = interest_desc;
	}

}