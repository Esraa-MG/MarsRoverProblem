package com.MarsRover.MarsRoverProblem.models.request;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class ControlReqModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4726669853350663412L;

	@NotBlank
	@Pattern(regexp = "[FBRL]+")
	private String command;

	@Valid
	@NotNull
	private PositionReqModel currentPosition;

}
