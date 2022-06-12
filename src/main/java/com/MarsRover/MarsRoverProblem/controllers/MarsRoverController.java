package com.MarsRover.MarsRoverProblem.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MarsRover.MarsRoverProblem.models.request.ControlReqModel;
import com.MarsRover.MarsRoverProblem.models.request.ControlWithObstaclesReqModel;
import com.MarsRover.MarsRoverProblem.models.response.PositionResModel;
import com.MarsRover.MarsRoverProblem.models.response.PositionWithObstaclesResModel;
import com.MarsRover.MarsRoverProblem.services.MarsRoverService;

@RestController
@RequestMapping("/mars-rover")
@Validated
public class MarsRoverController {

	@Autowired
	private MarsRoverService marsRoverService;

	@GetMapping("/move")
	public ResponseEntity<PositionResModel> getNextPosition(@RequestBody @Valid ControlReqModel controlReqModel) {

		return new ResponseEntity<>(marsRoverService.getNextPosition(controlReqModel), HttpStatus.OK);

	}

	@GetMapping("/move/obstacles")
	public ResponseEntity<PositionWithObstaclesResModel> getNextPositionWithObstacles(
			@RequestBody @Valid ControlWithObstaclesReqModel controlReqModel) {

		return new ResponseEntity<>(marsRoverService.getNextPositionWithObstacles(controlReqModel), HttpStatus.OK);

	}

}
