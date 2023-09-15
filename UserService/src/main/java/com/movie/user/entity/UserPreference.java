//package com.movie.user.entity;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.CollectionTable;
//import javax.persistence.Column;
//import javax.persistence.ElementCollection;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
////@Entity
////@Table(name = "USER_PREFERENCE")
//public class UserPreference {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int userPreferenceId;
//
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "userPreference")
//	private Preference prefrenceId;
//
//	@ElementCollection
//	@CollectionTable(name = "PREFERENCE_VALUE", joinColumns = @JoinColumn(name = "preference_id"))
//	@Column(name = "preference_values")
//	private List<String> values;
//
//	@ManyToOne(fetch = FetchType.LAZY)
//	private User user;
//
//	public Preference getPrefrenceId() {
//		return prefrenceId;
//	}
//
//	public void setPrefrenceId(Preference prefrenceId) {
//		this.prefrenceId = prefrenceId;
//	}
//
//	public List<String> getValues() {
//		return values;
//	}
//
//	public void setValues(List<String> values) {
//		this.values = values;
//	}
//
//	@JsonIgnore
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//}
