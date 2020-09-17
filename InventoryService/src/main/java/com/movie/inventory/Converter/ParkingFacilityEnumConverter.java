package com.movie.inventory.Converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.movie.inventory.enumValue.Parking_Facility;

@Converter(autoApply = true)
public class ParkingFacilityEnumConverter implements AttributeConverter<Parking_Facility, String> {

	@Override
	public String convertToDatabaseColumn(Parking_Facility attribute) {
		if (attribute == null) {
			return null;
		}
		return attribute.getCode();
	}

	@Override
	public Parking_Facility convertToEntityAttribute(String dbData) {
		if (dbData == null) {
			return null;
		}
		return Stream.of(Parking_Facility.values()).filter(c -> c.getCode().equals(dbData)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}

}
