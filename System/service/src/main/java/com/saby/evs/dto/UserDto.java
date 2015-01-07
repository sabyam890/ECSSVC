package com.saby.evs.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("User")
public class UserDto {
	
	@JsonProperty("addressline1")
	private String addressline1;
	@JsonProperty("addressline2")
	private String addressline2;
	@JsonProperty("city")
	private String city;
	@JsonProperty("constituincy")
	private String constituincy;
	@JsonProperty("email")
	private String email;
	@JsonProperty("firstname")
	private String firstname;
	@JsonProperty("lastname")
	private String lastname;
	@JsonProperty("password")
	private String password;
	@JsonProperty("phonenumber")
	private String phonenumber;

	@JsonProperty("state")
	private String state;
	@JsonProperty("status")
	private String status;
	@JsonProperty("username")
	private String username;
	@JsonProperty("zip")
	private BigDecimal zip;
	/**
	 * @return the addressline1
	 */
	@JsonIgnore
	public String getAddressline1() {
		return addressline1;
	}
	/**
	 * @param addressline1 the addressline1 to set
	 */
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	/**
	 * @return the addressline2
	 */
	@JsonIgnore
	public String getAddressline2() {
		return addressline2;
	}
	/**
	 * @param addressline2 the addressline2 to set
	 */
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	/**
	 * @return the city
	 */
	@JsonIgnore
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the constituincy
	 */
	@JsonIgnore
	public String getConstituincy() {
		return constituincy;
	}
	/**
	 * @param constituincy the constituincy to set
	 */
	public void setConstituincy(String constituincy) {
		this.constituincy = constituincy;
	}
	/**
	 * @return the email
	 */
	@JsonIgnore
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the firstname
	 */
	@JsonIgnore
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	@JsonIgnore
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the password
	 */
	@JsonIgnore
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the phonenumber
	 */
	@JsonIgnore
	public String getPhonenumber() {
		return phonenumber;
	}
	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	/**
	 * @return the state
	 */
	@JsonIgnore
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the status
	 */
	@JsonIgnore
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the username
	 */
	@JsonIgnore
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the zip
	 */
	@JsonIgnore
	public BigDecimal getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(BigDecimal zip) {
		this.zip = zip;
	}
	
	
}
