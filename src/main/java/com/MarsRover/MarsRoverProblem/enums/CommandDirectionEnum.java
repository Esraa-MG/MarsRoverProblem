package com.MarsRover.MarsRoverProblem.enums;

public enum CommandDirectionEnum {

	FORWARD('F'), BACKWARD('B'), ROTATE_LEFT('L'), ROTATE_RIGHT('R');

	private Character commandDirection;

	CommandDirectionEnum(Character commandDirection) {
		this.commandDirection = commandDirection;
	}

	public Character getCommandDirection() {
		return commandDirection;
	}

}
