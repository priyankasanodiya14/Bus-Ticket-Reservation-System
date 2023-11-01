package com.masai.service;

import com.masai.exception.LoginException;
import com.masai.model.AdminDto;
import com.masai.model.CurrentUserSession;

public interface AdminLoginService {
	/**
	 *
	 * @param dto
	 * @return
	 * @throws LoginException
	 */
	public CurrentUserSession logIntoAccount(AdminDto dto) throws LoginException;

	/**
	 *
	 * @param key
	 * @return
	 * @throws LoginException
	 */
	public String logOutFromAccount(String key) throws LoginException;
}