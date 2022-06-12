package com.MarsRover.MarsRoverProblem.models.request;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class ControlWithObstaclesReqModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3084741927455435017L;

	@NotBlank
	@Pattern(regexp = "[FBRL]+")
	private String command;

	@Valid
	@NotNull
	private PositionReqModel currentPosition;

	@NotEmpty
	@Valid
	private List<ObstaclePosition> obstacles;

}
