package com.movie.inventory.Converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.movie.inventory.enumValue.Food_Allowed;

@Converter(autoApply = true)
public class FoodEnumConverter implements AttributeConverter<Food_Allowed, String> {

	@Override
	public String convertToDatabaseColumn(Food_Allowed attribute) {
		if (attribute == null) {
			return null;
		}
		return attribute.getCode();
	}

	@Override
	public Food_Allowed convertToEntityAttribute(String dbData) {
		if (dbData == null) {
			return null;
		}
		return Stream.of(Food_Allowed.values()).filter(c -> c.getCode().equals(dbData)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}

}
