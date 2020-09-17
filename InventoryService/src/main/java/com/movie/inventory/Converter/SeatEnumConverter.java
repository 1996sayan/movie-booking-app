package com.movie.inventory.Converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.movie.inventory.enumValue.Seat_Status;

@Converter(autoApply = true)
public class SeatEnumConverter implements AttributeConverter<Seat_Status, String> {

	@Override
	public String convertToDatabaseColumn(Seat_Status attribute) {
		if (attribute == null) {
			return null;
		}
		return attribute.getCode();
	}

	@Override
	public Seat_Status convertToEntityAttribute(String code) {
		if (code == null) {
			return null;
		}

		return Stream.of(Seat_Status.values()).filter(c -> c.getCode().equals(code)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}

}
