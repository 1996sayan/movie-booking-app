package com.movie.inventory.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.movie.inventory.Converter.BagEnumConverter;
import com.movie.inventory.Converter.FoodEnumConverter;
import com.movie.inventory.Converter.ParkingFacilityEnumConverter;
import com.movie.inventory.enumValue.Bags_Allowed;
import com.movie.inventory.enumValue.Food_Allowed;
import com.movie.inventory.enumValue.Parking_Facility;

@Entity
@Table(name = "restrictions")
public class Restrictions {

	@Id
	@Column(name = "restriction_id")
	private Integer restrictionId;

	@Column(name = "food_Allowed")
	@Convert(converter = FoodEnumConverter.class)
	private Food_Allowed food_Allowed;

	@Column(name = "bags_Allowed")
	@Convert(converter = BagEnumConverter.class)
	private Bags_Allowed bags_Allowed;

	@Column(name = "parking_Facility")
	@Convert(converter = ParkingFacilityEnumConverter.class)
	private Parking_Facility parking_Facility;

	public Restrictions() {
		// TODO Auto-generated constructor stub
	}

	public Integer getRestrictionId() {
		return restrictionId;
	}

	public void setRestrictionId(Integer restrictionId) {
		this.restrictionId = restrictionId;
	}

	public Food_Allowed getFood_Allowed() {
		return food_Allowed;
	}

	public void setFood_Allowed(Food_Allowed food_Allowed) {
		this.food_Allowed = food_Allowed;
	}

	public Bags_Allowed getBags_Allowed() {
		return bags_Allowed;
	}

	public void setBags_Allowed(Bags_Allowed bags_Allowed) {
		this.bags_Allowed = bags_Allowed;
	}

	public Parking_Facility getParking_Facility() {
		return parking_Facility;
	}

	public void setParking_Facility(Parking_Facility parking_Facility) {
		this.parking_Facility = parking_Facility;
	}

}
