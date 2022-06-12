package com.MarsRover.MarsRoverProblem.services;

import com.MarsRover.MarsRoverProblem.models.request.ControlReqModel;
import com.MarsRover.MarsRoverProblem.models.request.ControlWithObstaclesReqModel;
import com.MarsRover.MarsRoverProblem.models.response.PositionResModel;
import com.MarsRover.MarsRoverProblem.models.response.PositionWithObstaclesResModel;

public interface MarsRoverService {

	PositionResModel getNextPosition(ControlReqModel controlReqModel);

	PositionWithObstaclesResModel getNextPositionWithObstacles(ControlWithObstaclesReqModel controlReqModel);

}
