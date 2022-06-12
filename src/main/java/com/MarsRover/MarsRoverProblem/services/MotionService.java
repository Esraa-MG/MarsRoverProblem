package com.MarsRover.MarsRoverProblem.services;

import com.MarsRover.MarsRoverProblem.models.response.Position;

public interface MotionService {

	Position moveForward(Position position);

	Position moveBackward(Position position);

	Position moveLeft(Position position);

	Position moveRight(Position position);

}
