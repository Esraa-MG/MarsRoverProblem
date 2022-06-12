package com.MarsRover.MarsRoverProblem.models.request;

import java.io.Serializable;

import lombok.Data;

@Data
public class ObstaclePosition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2995578470713698631L;

	private int x;
	private int y;

}
