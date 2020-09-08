package com.movie.user.util;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanUtil {

	@Autowired
	private static ModelMapper modelMapper;

	/**
	 * Works as a list of object Vo mapper
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
		return modelMapper.map(listType, listType);
	}

	/**
	 * Works as a Vo mapper
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
	 * Works as a Vo mapper but here Ambiguity is ignored
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
