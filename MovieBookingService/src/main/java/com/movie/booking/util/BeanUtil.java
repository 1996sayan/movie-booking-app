package com.movie.booking.util;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.movie.booking.vo.BookingResponseVo;

@Component
public class BeanUtil {

	
	private static ModelMapper modelMapper;
	
	static {
		modelMapper=new ModelMapper();
	}

	public static ModelMapper getModelMapper() {
		modelMapper.getConfiguration().setAmbiguityIgnored(true);
		return modelMapper;
	}
	
	
	private static<U> Type getType(U u) {
		Type listType = new TypeToken<List<U>>() {

		}.getType();
		return listType;
	}
	
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
		Type listType = getType(u);
		return modelMapper.map(list, listType);
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
//	public static <T, U> U copyProperties(T t,U u) {
//		
//		return modelMapper.map(t,Class.forName(u));
//	}

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
