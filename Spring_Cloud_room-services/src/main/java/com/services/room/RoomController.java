package com.services.room;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController {

	@Autowired
	private RoomRepository roomRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber) {
		if (StringUtils.isNotEmpty(roomNumber)) {
			return Collections.singletonList(this.roomRepository.findByRoomNumber(roomNumber));
		}
		return (List<Room>) this.roomRepository.findAll();
	}

}
