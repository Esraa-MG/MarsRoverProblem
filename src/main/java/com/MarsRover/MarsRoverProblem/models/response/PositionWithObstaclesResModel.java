package com.MarsRover.MarsRoverProblem.models.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class PositionWithObstaclesResModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -196166476047337489L;

	private Position newPosition;
	private boolean stopped;

}
