package com.movie.inventory.Converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.movie.inventory.enumValue.Bags_Allowed;

@Converter(autoApply = true)
public class BagEnumConverter implements AttributeConverter<Bags_Allowed, String> {

	@Override
	public String convertToDatabaseColumn(Bags_Allowed attribute) {
		if (attribute == null) {
			return null;
		}
		return attribute.getCode();
	}

	@Override
	public Bags_Allowed convertToEntityAttribute(String code) {
		if (code == null) {
			return null;
		}
		return Stream.of(Bags_Allowed.values()).filter(c -> c.getCode().equals(code)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}

}
