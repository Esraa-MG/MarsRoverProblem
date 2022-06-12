package com.MarsRover.MarsRoverProblem.models.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class PositionResModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9126913472557960668L;

	private Position newPosition;

}
