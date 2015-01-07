package com.saby.evs.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.saby.evs.dto.UserDto;

@JsonTypeName("UserResponse")
public class UserResponse {
	@JsonProperty("User")
	private UserDto userDto;

	@JsonIgnore
	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
}
