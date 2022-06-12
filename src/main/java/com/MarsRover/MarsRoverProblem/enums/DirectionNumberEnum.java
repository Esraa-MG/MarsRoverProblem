package com.MarsRover.MarsRoverProblem.enums;

public enum DirectionNumberEnum {
	NORTH(1), EAST(2), SOUTH(3), WEST(4);

	private int direction;

	DirectionNumberEnum(int direction) {
		this.direction = direction;
	}

	public int getDirection() {
		return direction;
	}

}
