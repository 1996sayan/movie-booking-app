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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.movie.inventory.Converter.TheatreEnumConverter;
import com.movie.inventory.enumValue.Theatre_Type;

import lombok.Data;

@Entity
@Data
@Table(name = "theatre")
public class Theatre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "theatre_id")
	private long theatreId;

	@Column(name = "theatre_name")
	private String theatreName;

	@Column(name = "theatre_type")
	@Convert(converter = TheatreEnumConverter.class)
	private Theatre_Type theatreType;

	@OneToOne
	private Review review;

	@OneToOne(cascade = CascadeType.ALL)
	private Restrictions restrictions;

	@Column(name = "location_id")
	private Long locationId;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Screen> screens;
}
