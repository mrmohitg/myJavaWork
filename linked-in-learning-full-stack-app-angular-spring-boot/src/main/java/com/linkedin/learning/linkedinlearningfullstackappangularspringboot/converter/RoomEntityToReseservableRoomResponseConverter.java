package com.linkedin.learning.linkedinlearningfullstackappangularspringboot.converter;

import org.springframework.core.convert.converter.Converter;

import com.linkedin.learning.linkedinlearningfullstackappangularspringboot.entity.RoomEntity;
import com.linkedin.learning.linkedinlearningfullstackappangularspringboot.model.Links;
import com.linkedin.learning.linkedinlearningfullstackappangularspringboot.model.Self;
import com.linkedin.learning.linkedinlearningfullstackappangularspringboot.model.response.ReservableRoomResponse;
import com.linkedin.learning.linkedinlearningfullstackappangularspringboot.rest.ResourceConstants;

public class RoomEntityToReseservableRoomResponseConverter implements Converter<RoomEntity, ReservableRoomResponse>{

	@Override
	public ReservableRoomResponse convert(RoomEntity source) {
		ReservableRoomResponse reservationResponse = new ReservableRoomResponse();
		reservationResponse.setRoomNumber(source.getRoomNumber());
		reservationResponse.setPrice(Integer.valueOf(source.getPrice()));
		Self self = new Self();
		self.setRef(ResourceConstants.ROOM_RESERVATION_V1+"/"+source.getId());
		Links links = new Links();
		links.setSelf(self);
		reservationResponse.setLinks(links);
		return reservationResponse;
	}

}
