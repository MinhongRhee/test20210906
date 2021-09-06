package com.cos.test20210906.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginReqDto {
	private String username;
	private String password;
	private String idChecked;
	
	public static void main(String[] args) {
		LoginReqDto dto = new LoginReqDto();
	}
}
