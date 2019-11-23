package com.services.room;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long>{
	
	public Room findByRoomNumber(String roomNumber);

}
