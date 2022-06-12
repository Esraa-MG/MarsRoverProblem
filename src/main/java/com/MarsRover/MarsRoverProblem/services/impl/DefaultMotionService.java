package com.MarsRover.MarsRoverProblem.services.impl;

import org.springframework.stereotype.Service;

import com.MarsRover.MarsRoverProblem.enums.DirectionNumberEnum;
import com.MarsRover.MarsRoverProblem.enums.DirectionStringEnum;
import com.MarsRover.MarsRoverProblem.models.response.Position;
import com.MarsRover.MarsRoverProblem.services.MotionService;

@Service
public class DefaultMotionService implements MotionService {

	@Override
	public Position moveForward(Position position) {

		if (position.getDirection().equals(DirectionStringEnum.NORTH.name()))
			position.setY(position.getY() + 1);
		else if (position.getDirection().equals(DirectionStringEnum.EAST.name()))
			position.setX(position.getX() + 1);
		else if (position.getDirection().equals(DirectionStringEnum.SOUTH.name()))
			position.setY(position.getY() - 1);
		else if (position.getDirection().equals(DirectionStringEnum.WEST.name()))
			position.setX(position.getX() - 1);

		return position;

	}

	@Override
	public Position moveBackward(Position position) {

		if (position.getDirection().equals(DirectionStringEnum.NORTH.name()))
			position.setY(position.getY() - 1);
		else if (position.getDirection().equals(DirectionStringEnum.EAST.name()))
			position.setX(position.getX() - 1);
		else if (position.getDirection().equals(DirectionStringEnum.SOUTH.name()))
			position.setY(position.getY() + 1);
		else if (position.getDirection().equals(DirectionStringEnum.WEST.name()))
			position.setX(position.getX() + 1);

		return position;

	}

	@Override
	public Position moveLeft(Position position) {

		int directionNumber = convertStringDirectionToNumber(position.getDirection());
		directionNumber = directionNumber == 1 ? 4 : directionNumber - 1;
		String newDirectionString = convertNumberDirectionToString(directionNumber);
		position.setDirection(newDirectionString);
		return position;

	}

	@Override
	public Position moveRight(Position position) {

		int directionNumber = convertStringDirectionToNumber(position.getDirection());
		directionNumber = directionNumber == 4 ? 1 : directionNumber + 1;
		String newDirectionString = convertNumberDirectionToString(directionNumber);
		position.setDirection(newDirectionString);
		return position;
	}

	private int convertStringDirectionToNumber(String direction) {

		if (direction.equals(DirectionStringEnum.NORTH.name()))
			return DirectionNumberEnum.NORTH.getDirection();
		else if (direction.equals(DirectionStringEnum.EAST.name()))
			return DirectionNumberEnum.EAST.getDirection();
		else if (direction.equals(DirectionStringEnum.SOUTH.name()))
			return DirectionNumberEnum.SOUTH.getDirection();
		else if (direction.equals(DirectionStringEnum.WEST.name()))
			return DirectionNumberEnum.WEST.getDirection();
		else
			return 0;
	}

	private String convertNumberDirectionToString(int direction) {

		if (direction == DirectionNumberEnum.NORTH.getDirection())
			return DirectionStringEnum.NORTH.name();
		else if (direction == DirectionNumberEnum.EAST.getDirection())
			return DirectionStringEnum.EAST.name();
		else if (direction == DirectionNumberEnum.SOUTH.getDirection())
			return DirectionStringEnum.SOUTH.name();
		else if (direction == DirectionNumberEnum.WEST.getDirection())
			return DirectionStringEnum.WEST.name();
		else
			return null;
	}

}
