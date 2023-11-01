package com.masai.service;

import java.util.List;

import com.masai.exception.RouteException;
import com.masai.exception.UserException;
import com.masai.model.Route;

public interface RouteService {
	/**
	 *
	 * @param route
	 * @param key
	 * @return
	 * @throws RouteException
	 * @throws UserException
	 */
	public Route addRoute(Route route,String key) throws RouteException, UserException;

	/**
	 *
	 * @param route
	 * @param key
	 * @return
	 * @throws RouteException
	 * @throws UserException
	 */
	public Route updateRoute(Route route,String key) throws RouteException, UserException;

	/**
	 *
	 * @param routeId
	 * @param key
	 * @return
	 * @throws RouteException
	 * @throws UserException
	 */
	public Route deleteRoute(Integer routeId,String key) throws RouteException, UserException;

	/**
	 *
	 * @param routeId
	 * @param key
	 * @return
	 * @throws RouteException
	 * @throws UserException
	 */
	public Route viewRoute(Integer routeId,String key) throws RouteException, UserException;

	/**
	 *
	 * @param key
	 * @return
	 * @throws RouteException
	 * @throws UserException
	 */
	public List<Route> viewAllRoute(String key) throws RouteException, UserException;
	
	
	
	
}
