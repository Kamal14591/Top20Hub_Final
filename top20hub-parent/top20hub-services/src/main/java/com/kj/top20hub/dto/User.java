package com.kj.top20hub.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_details")
public class User {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String name;

	@Column
	private String email;

	@Column
	private int contactNo;

	@Column
	private String company;

	@Column
	private String Designation;

	@Column
	private String password;

	@Column
	private String intrest;

	@Column
	private String f_url;

	@Column
	private String g_url;

	@Column
	private String t_url;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIntrest() {
		return intrest;
	}

	public void setIntrest(String intrest) {
		this.intrest = intrest;
	}

	public String getF_url() {
		return f_url;
	}

	public void setF_url(String f_url) {
		this.f_url = f_url;
	}

	public String getG_url() {
		return g_url;
	}

	public void setG_url(String g_url) {
		this.g_url = g_url;
	}

	public String getT_url() {
		return t_url;
	}

	public void setT_url(String t_url) {
		this.t_url = t_url;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + ", company="
				+ company + ", Desigination=" + Designation + ", password=" + password + ", intrest=" + intrest
				+ ", f_url=" + f_url + ", g_url=" + g_url + ", t_url=" + t_url + "]";
	}

}
