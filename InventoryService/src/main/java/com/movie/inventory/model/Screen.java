package com.movie.inventory.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.movie.inventory.Converter.ScreenEnumConverter;
import com.movie.inventory.enumValue.Screen_Type;

import lombok.Data;

@Entity
@Data
@Table(name = "screen")
public class Screen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "screen_id")
	private long screenId;

	@Column(name = "screen_type")
	@Convert(converter = ScreenEnumConverter.class)
	private Screen_Type screen_type;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Show> shows;

	@Column(name = "screen_name")
	private String screenName;

	@Column
	private Integer total_capacity;
}
