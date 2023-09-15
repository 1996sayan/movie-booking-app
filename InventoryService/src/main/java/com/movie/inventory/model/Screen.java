package com.movie.inventory.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.movie.inventory.Converter.ScreenEnumConverter;
import com.movie.inventory.enumValue.Screen_Type;

@Entity
@Table(name = "screen")
public class Screen {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
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

	public Screen() {
		// TODO Auto-generated constructor stub
	}

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public Screen_Type getScreen_type() {
		return screen_type;
	}

	public void setScreen_type(Screen_Type screen_type) {
		this.screen_type = screen_type;
	}

	public List<Show> getShows() {
		return shows;
	}

	public void setShows(List<Show> shows) {
		this.shows = shows;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Integer getTotal_capacity() {
		return total_capacity;
	}

	public void setTotal_capacity(Integer total_capacity) {
		this.total_capacity = total_capacity;
	}

}
