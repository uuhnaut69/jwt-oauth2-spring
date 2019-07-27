package com.uuhnaut69.sercurityjwt.ReqModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginReqModel {
	@NotBlank
	@Size(min = 3, max = 60)
	private String username;

	@NotBlank
	@Size(min = 6, max = 40)
	private String password;

}
