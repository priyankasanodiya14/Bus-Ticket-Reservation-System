package com.masai.model;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginDTO {
	@NotNull(message ="Username should not be null.")
	private String username;
	@NotNull(message ="Password should not be null.")
	private String password;
}
