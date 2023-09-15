package com.movie.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "social_media")
public class SocialMedia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String facebook;

	private String instagram;

	private String twitter;

	private String rotten_tomatoes;

	public SocialMedia() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getRotten_tomatoes() {
		return rotten_tomatoes;
	}

	public void setRotten_tomatoes(String rotten_tomatoes) {
		this.rotten_tomatoes = rotten_tomatoes;
	}

}
