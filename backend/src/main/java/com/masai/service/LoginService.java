package com.masai.service;

import javax.security.auth.login.LoginException;

import com.masai.model.CurrentUserSession;
import com.masai.model.LoginDTO;

public interface LoginService {
	/**
	 *
	 * @param dto
	 * @return
	 * @throws LoginException
	 */
	public CurrentUserSession logIntoAccount(LoginDTO dto) throws LoginException;

	/**
	 *
	 * @param key
	 * @return
	 * @throws LoginException
	 */
	public String logOutFromAccount(String key) throws LoginException;
}
