package com.movie.inventory.util;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Generic method to use all over this service
 * 
 * @author M1050887
 *
 * @param <T>
 */
@Component
public class BeanUtil<T> {

	@Autowired
	private static ModelMapper modelMapper;

	/**
	 * converts List of Booking to List of BookingResponse
	 * 
	 * @param <T>
	 * @param <U>
	 * @param list
	 * @param u
	 * @return
	 */
	public static <T, U> List<?> copyListOfProperties(List<T> list, U u) {
		Type listType = new TypeToken<List<U>>() {
		}.getType();
		return modelMapper.map(list, listType);
	}

	/**
	 * converts Booking to BookingResponse
	 * 
	 * @param <T>
	 * @param <U>
	 * @param t
	 * @param object
	 * @return
	 */
	public static <T, U> Object copyProperties(T t, Object object) {
		modelMapper.map(t, object);
		return object;
	}

	/**
	 * converts Booking to BookingResponse, Ambiguity is ignored.
	 * 
	 * @param <T>
	 * @param element
	 * @param object
	 * @return
	 */
	public static <T> Object copyProp(T element, Object object) {
		modelMapper.getConfiguration().setAmbiguityIgnored(true);
		modelMapper.map(element, object);
		return object;
	}
}
