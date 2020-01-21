package com.socks.api.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.annotation.Generated;

@Getter
@Setter
@ToString
@Generated("com.robohorse.robopojogenerator")
@Accessors(fluent = true)
public class UserPayload {

	@JsonProperty("password")
	private String password;

	@JsonProperty("email")
	private String email;

	@JsonProperty("username")
	private String username;

}