package com.linkedin.learning.linkedinlearningfullstackappangularspringboot.converter;

import org.springframework.core.convert.converter.Converter;

import com.linkedin.learning.linkedinlearningfullstackappangularspringboot.entity.ReservationEntity;
import com.linkedin.learning.linkedinlearningfullstackappangularspringboot.model.response.ReservationResponse;

public class ReservationEntityToReservationResponseConverter implements Converter<ReservationEntity, ReservationResponse>{

	@Override
	public ReservationResponse convert(ReservationEntity source) {

		ReservationResponse reservationResponse = new ReservationResponse();
		reservationResponse.setCheckin(source.getCheckin());
		reservationResponse.setCheckout(source.getCheckout());
		
		
		return reservationResponse;
	}

}
