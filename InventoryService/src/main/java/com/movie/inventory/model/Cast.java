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

import lombok.Data;

@Entity
@Data
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
}
