package com.CustomerManagement.models;

import lombok.Data;

@Data
public class JwtResponse {

	private String jwtToken;
	private String username;

}
