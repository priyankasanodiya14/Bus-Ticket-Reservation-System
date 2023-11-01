package com.masai.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer feedbackId;
	
	@Min(value = 1, message = "Rating should be between 1 to 5")
	@Max(value = 10, message = "Rating should be between 1 to 5")
	private Integer driverRating;
	
	@Min(value = 1, message = "Rating should be between 1 to 5")
	@Max(value = 10, message = "Rating should be between 1 to 5")
	private Integer serviceRating;
	
	@Min(value = 1, message = "Rating should be between 1 to 5")
	@Max(value = 10, message = "Rating should be between 1 to 5")
	private Integer overallRating;
	
	private String comments;
	
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@PastOrPresent(message = "Date should be current date or past date")
	private LocalDate feedbackDate = LocalDate.now();
	
	@JsonIgnore
	@OneToOne
	private User user;
	
	@JsonIgnore
	@OneToOne
	private Bus bus;

	public Feedback(
			@Min(value = 1, message = "Rating should be between 1 to 5") @Max(value = 5, message = "Rating should be between 1 to 5") Integer driverRating,
			@Min(value = 1, message = "Rating should be between 1 to 5") @Max(value = 5, message = "Rating should be between 1 to 5") Integer serviceRating,
			@Min(value = 1, message = "Rating should be between 1 to 5") @Max(value = 5, message = "Rating should be between 1 to 5") Integer overallRating,
			String comments) {
		super();
		this.driverRating = driverRating;
		this.serviceRating = serviceRating;
		this.overallRating = overallRating;
		this.comments = comments;
	}
	
	
	
}
