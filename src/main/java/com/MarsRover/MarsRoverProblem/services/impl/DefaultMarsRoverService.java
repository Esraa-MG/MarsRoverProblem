package com.MarsRover.MarsRoverProblem.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MarsRover.MarsRoverProblem.models.request.ControlReqModel;
import com.MarsRover.MarsRoverProblem.models.request.PositionReqModel;
import com.MarsRover.MarsRoverProblem.models.response.Position;
import com.MarsRover.MarsRoverProblem.models.response.PositionResModel;
import com.MarsRover.MarsRoverProblem.services.CommandService;
import com.MarsRover.MarsRoverProblem.services.MarsRoverService;

@Service
public class DefaultMarsRoverService implements MarsRoverService {

	@Autowired
	private CommandService commandService;

	@Override
	public PositionResModel getNextPosition(ControlReqModel controlReqModel) {

		PositionResModel positionResModel = new PositionResModel();

		positionResModel.setNewPosition(commandService.translateCommand(controlReqModel.getCommand(),
				mapPositionReqModelToPosition(controlReqModel.getCurrentPosition())));

		return positionResModel;
	}

	private Position mapPositionReqModelToPosition(PositionReqModel positionReqModel) {

		return new Position(positionReqModel.getX(), positionReqModel.getY(), positionReqModel.getDirection());

	}
}
