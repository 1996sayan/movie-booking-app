package com.movie.inventory.Converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.movie.inventory.enumValue.Screen_Type;

@Converter(autoApply = true)
public class ScreenEnumConverter implements AttributeConverter<Screen_Type, String> {

	@Override
	public String convertToDatabaseColumn(Screen_Type attribute) {
		if (attribute == null) {
			return null;
		}
		return attribute.getCode();

	}

	@Override
	public Screen_Type convertToEntityAttribute(String dbData) {
		if (dbData == null) {
			return null;
		}
		return Stream.of(Screen_Type.values()).filter(c -> c.getCode().equals(dbData)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}

}
