package com.movie.inventory.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cast")
public class Cast {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cast_id")
	private long castId;

	@ElementCollection
	@CollectionTable(name = "actor_details", joinColumns = @JoinColumn(name = "cast_id"))
	@Column(name = "actor_name")
	private List<String> actorName;

	@ElementCollection
	@CollectionTable(name = "actress_details", joinColumns = @JoinColumn(name = "cast_id"))
	@Column(name = "actress_name")
	private List<String> actressName;

	public Cast() {
		// TODO Auto-generated constructor stub
	}

	public long getCastId() {
		return castId;
	}

	public void setCastId(long castId) {
		this.castId = castId;
	}

	public List<String> getActorName() {
		return actorName;
	}

	public void setActorName(List<String> actorName) {
		this.actorName = actorName;
	}

	public List<String> getActressName() {
		return actressName;
	}

	public void setActressName(List<String> actressName) {
		this.actressName = actressName;
	}

}
