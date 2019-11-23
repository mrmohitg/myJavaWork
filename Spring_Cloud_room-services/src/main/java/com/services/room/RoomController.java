package com.services.room;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="rooms", description="Data Service Operations on Rooms", tags="rooms")
@RequestMapping("/room")
public class RoomController {

	@Autowired
	private RoomRepository roomRepository;

	@ApiOperation(value="Get All Rooms", notes="Get all the rooms in the system", nickname="getRooms")
	@RequestMapping(method = RequestMethod.GET)
	public List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber) {
		if (StringUtils.isNotEmpty(roomNumber)) {
			return Collections.singletonList(this.roomRepository.findByRoomNumber(roomNumber));
		}
		return (List<Room>) this.roomRepository.findAll();
	}

}
