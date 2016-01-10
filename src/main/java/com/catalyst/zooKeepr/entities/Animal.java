package com.catalyst.zooKeepr.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Column(unique = true)
	private String name;
	
	@NotNull
	private String sciName;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "food_id")
	private Food favFood;
	
	@NotNull
	private String infoLink;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSciName() {
		return sciName;
	}
	public void setSciName(String sciName) {
		this.sciName = sciName;
	}
	public Food getFavFood() {
		return favFood;
	}
	public void setFavFood(Food favFood) {
		this.favFood = favFood;
	}
	public String getInfoLink() {
		return infoLink;
	}
	public void setInfoLink(String infoLink) {
		this.infoLink = infoLink;
	}

}
