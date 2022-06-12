package com.MarsRover.MarsRoverProblem.services;

import com.MarsRover.MarsRoverProblem.models.request.ControlWithObstaclesReqModel;
import com.MarsRover.MarsRoverProblem.models.response.Position;
import com.MarsRover.MarsRoverProblem.models.response.PositionWithObstaclesResModel;

public interface CommandService {

	Position translateCommand(String command, Position currentPosition);

	Position translateCommand(Character command, Position currentPosition);

	Position translateCommand(String command, ControlWithObstaclesReqModel currentPosition,
			PositionWithObstaclesResModel positionResModel);

}
