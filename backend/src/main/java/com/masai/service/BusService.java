package com.masai.service;

import java.util.List;

import com.masai.exception.BusException;
import com.masai.exception.UserException;
import com.masai.model.Bus;

public interface BusService {
	
//methods you can find inside bus module

	/**
	 *
	 * @param bus
	 * @param key
	 * @return
	 * @throws BusException
	 * @throws UserException
	 */
	public Bus addBus(Bus bus, String key) throws BusException, UserException;

	/**
	 *
	 * @param bus
	 * @param key
	 * @return
	 * @throws BusException
	 * @throws UserException
	 */
	public Bus updateBus(Bus bus, String key)throws BusException, UserException;

	/**
	 *
	 * @param busId
	 * @param key
	 * @return
	 * @throws BusException
	 * @throws UserException
	 */
	public Bus deleteBus(Integer busId, String key)throws BusException, UserException;

	/**
	 *
	 * @param busId
	 * @param key
	 * @return
	 * @throws BusException
	 * @throws UserException
	 */
	public Bus viewBus(Integer busId, String key)throws BusException, UserException;

	/**
	 *
	 * @param busType
	 * @param key
	 * @return
	 * @throws BusException
	 * @throws UserException
	 */
	public List<Bus> viewBusByType(String busType, String key)throws BusException, UserException;

	/**
	 *
	 * @param key
	 * @return
	 * @throws BusException
	 * @throws UserException
	 */
	public List<Bus> viewAllBus(String key)throws BusException, UserException;

}
