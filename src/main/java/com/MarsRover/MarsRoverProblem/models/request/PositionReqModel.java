package com.MarsRover.MarsRoverProblem.models.request;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class PositionReqModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8164555796746924613L;

	private int x;
	private int y;

	@NotBlank
	@Pattern(regexp = "NORTH|EAST|WEST|SOUTH")
	private String direction;

}
