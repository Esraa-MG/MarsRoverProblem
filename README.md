# MarsRoverProblem

this prject contains two endpoints:
1/http://localhost:8080/mars-rover/move which covers problem part 1
	this endPoint accepts ControlReqModel = {
		"command":"FLFFFRFLB",
		"currentPosition": {
			"x": 4,
			"y": 2,
			"direction": "EAST"
		}
	}
	
	ControlReqModel contains the command that moves the rover and  the current position of the  rover
	
	the endPoint returns PositionResModel = {
		"newPosition": {
			"x": 6,
			"y": 4,
			"direction": "NORTH"
			}
	}

	which contains the new position of the rover after following the command
 
2/http://localhost:8080/mars-rover/move/obstacles which covers problem part 2
	this endPoint accepts ControlWithObstaclesReqModel = {
		"command":"FLFFFRFLB",
		"currentPosition": {
			"x": 4,
			"y": 2,
			"direction": "EAST"
		}, 
		"obstacles":[
			{"x" : 1, "y": 2},{"x":6,"y":4}
		]
	}
	ControlWithObstaclesReqModel contains the command that moves the rover ,  the current position of the  rover
	and positions of the obstacles that facing the rover
	
	the endPoint returns PositionWithObstaclesResModel = {
		"newPosition": {
			"x": 6,
			"y": 4,
			"direction": "NORTH"
		},
		"stopped": true
	}
	
	which contains the new position of the rover after following the command and a boolean indicated if the rover had stopped 
	due to collsion with obstacles and if it is true the newPosition of the rover will represent the collsion position