package com.masai.service;

import java.util.List;

import com.masai.exception.BusException;
import com.masai.exception.FeedbackException;
import com.masai.exception.UserException;
import com.masai.model.Feedback;

public interface IFeedbackService {
	/**
	 *
	 * @param busId
	 * @param feedback
	 * @param key
	 * @return
	 * @throws FeedbackException
	 * @throws UserException
	 * @throws BusException
	 */
	public String addFeedback( Integer busId, Feedback feedback,String key) throws FeedbackException, UserException, BusException;

	/**
	 *
	 * @param feedback
	 * @param key
	 * @return
	 * @throws FeedbackException
	 * @throws UserException
	 */
	public Feedback updateFeedback(Feedback feedback,String key) throws FeedbackException,UserException;

	/**
	 *
	 * @param feedbackId
	 * @param key
	 * @return
	 * @throws FeedbackException
	 * @throws UserException
	 */
	public Feedback viewFeedback(Integer feedbackId,String key) throws FeedbackException,UserException;

	/**
	 *
	 * @param key
	 * @return
	 * @throws FeedbackException
	 * @throws UserException
	 */
	public List<Feedback> viewAllFeedback(String key) throws FeedbackException,UserException;
}
