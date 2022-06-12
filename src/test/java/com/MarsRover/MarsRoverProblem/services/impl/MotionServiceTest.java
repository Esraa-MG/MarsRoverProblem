package com.MarsRover.MarsRoverProblem.services.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.MarsRover.MarsRoverProblem.models.response.Position;

class MotionServiceTest {

	@InjectMocks
	DefaultMotionService motionService;

	Position position;

	@BeforeEach
	void setUp() throws Exception {

		MockitoAnnotations.openMocks(this);
		position = new Position();
		position.setDirection("NORTH");
		position.setX(1);
		position.setY(3);

	}

	@Test
	final void testMoveForward() {

		Position newPosition = motionService.moveForward(position);
		assertNotNull(newPosition);
		assertEquals("NORTH", newPosition.getDirection());
		assertEquals(4, newPosition.getY());
		assertEquals(1, newPosition.getX());
	}

	@Test
	final void testMoveBackward() {

		Position newPosition = motionService.moveBackward(position);
		assertNotNull(newPosition);
		assertEquals("NORTH", newPosition.getDirection());
		assertEquals(2, newPosition.getY());
		assertEquals(1, newPosition.getX());
	}

	@Test
	final void testMoveLeft() {

		Position newPosition = motionService.moveLeft(position);
		assertNotNull(newPosition);
		assertEquals("WEST", newPosition.getDirection());
		assertEquals(3, newPosition.getY());
		assertEquals(1, newPosition.getX());
	}

	@Test
	final void testMoveRight() {

		Position newPosition = motionService.moveRight(position);
		assertNotNull(newPosition);
		assertEquals("EAST", newPosition.getDirection());
		assertEquals(3, newPosition.getY());
		assertEquals(1, newPosition.getX());
	}

}
