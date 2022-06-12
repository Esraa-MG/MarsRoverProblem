package com.MarsRover.MarsRoverProblem.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MarsRover.MarsRoverProblem.enums.CommandDirectionEnum;
import com.MarsRover.MarsRoverProblem.models.response.Position;
import com.MarsRover.MarsRoverProblem.services.CommandService;

@Service
public class DefaultCommandService implements CommandService {

	@Autowired
	private DefaultMotionService motionService;

	@Override
	public Position translateCommand(String command, Position currentPosition) {

		Position newPosition = currentPosition;
		for (int i = 0; i < command.length(); i++)
			newPosition = translateCommand(command.charAt(i), newPosition);

		return newPosition;
	}

	@Override
	public Position translateCommand(Character command, Position currentPosition) {

		if (command.equals(CommandDirectionEnum.FORWARD.getCommandDirection()))
			return motionService.moveForward(currentPosition);
		else if (command.equals(CommandDirectionEnum.BACKWARD.getCommandDirection()))
			return motionService.moveBackward(currentPosition);
		else if (command.equals(CommandDirectionEnum.ROTATE_LEFT.getCommandDirection()))
			return motionService.moveLeft(currentPosition);
		else if (command.equals(CommandDirectionEnum.ROTATE_RIGHT.getCommandDirection()))
			return motionService.moveRight(currentPosition);
		else
			return null;

	}

}
