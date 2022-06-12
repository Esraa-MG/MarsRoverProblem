package com.MarsRover.MarsRoverProblem.services;

import com.MarsRover.MarsRoverProblem.models.request.ControlReqModel;
import com.MarsRover.MarsRoverProblem.models.response.PositionResModel;

public interface MarsRoverService {

	PositionResModel getNextPosition(ControlReqModel controlReqModel);

}
