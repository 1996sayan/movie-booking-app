package com.movie.inventory.Converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.movie.inventory.enumValue.Theatre_Type;

@Converter(autoApply = true)
public class TheatreEnumConverter implements AttributeConverter<Theatre_Type, String> {

	@Override
	public String convertToDatabaseColumn(Theatre_Type attribute) {
		if (attribute == null) {
			return null;
		}
		return attribute.getCode();
	}

	@Override
	public Theatre_Type convertToEntityAttribute(String dbData) {
		if (dbData == null) {
			return null;
		}
		return Stream.of(Theatre_Type.values()).filter(c -> c.getCode().equals(dbData)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}

}
