package com.cos.test20210906.web.dto;

import com.cos.test20210906.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateReqDto {
	private String username;
	private String password;
	private String cpassword;
	
	public static void main(String[] args) {
		UpdateReqDto dto = new UpdateReqDto();
	}
}
