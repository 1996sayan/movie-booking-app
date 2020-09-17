package com.movie.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "social_media")
public class SocialMedia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String facebook;

	private String instagram;

	private String twitter;

	private String rotten_tomatoes;
}
