package com.MarsRover.MarsRoverProblem.services;

import com.MarsRover.MarsRoverProblem.models.response.Position;

public interface CommandService {

	Position translateCommand(String command, Position currentPosition);

	Position translateCommand(Character command, Position currentPosition);

}
