package com.masai.service;

import java.time.LocalDate;
import java.util.List;

import com.masai.exception.BusException;
import com.masai.exception.ReservationException;
import com.masai.exception.UserException;
import com.masai.model.Bus;
import com.masai.model.Reservation;

public interface ReservationService {
	/**
	 *
	 * @param busId
	 * @param reservation
	 * @param key
	 * @return Reservation object
	 * @throws ReservationException
	 * @throws BusException
	 * @throws UserException
	 */
	public Reservation addNewReservation(Integer busId,Reservation reservation, String key)throws ReservationException, BusException, UserException;

	/**
	 *
	 * @param reservation
	 * @param key
	 * @return
	 * @throws ReservationException
	 * @throws UserException
	 */
	public Reservation updateReservation(Reservation reservation, String key)throws ReservationException, UserException;

	/**
	 *
	 * @param reservationId
	 * @param key
	 * @return
	 * @throws ReservationException
	 * @throws UserException
	 */
	public Reservation deleteReservation(Integer reservationId, String key) throws ReservationException, UserException;

	/**
	 *
	 * @param reservationId
	 * @param key
	 * @return
	 * @throws ReservationException
	 * @throws UserException
	 */
	public Reservation viewReservationById(Integer reservationId, String key)throws ReservationException, UserException;

	/**
	 *
	 * @param key
	 * @return list of reservation object
	 * @throws ReservationException
	 * @throws UserException
	 */
	public List<Reservation> viewAllReservation( String key)throws ReservationException, UserException;

	/**
	 *
	 * @param date
	 * @param key
	 * @return
	 * @throws ReservationException
	 * @throws UserException
	 */
	public List<Reservation> getAllReservationByDate(LocalDate date,String key)throws ReservationException, UserException;
	Integer getCurrentUserReservedBusId() throws UserException;
}
