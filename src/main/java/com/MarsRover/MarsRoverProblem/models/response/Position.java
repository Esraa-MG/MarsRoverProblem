package com.MarsRover.MarsRoverProblem.models.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8191453601365544387L;

	private int x;
	private int y;
	private String direction;

}
