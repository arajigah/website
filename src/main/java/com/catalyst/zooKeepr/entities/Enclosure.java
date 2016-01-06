package com.catalyst.zooKeepr.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Enclosure {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Column(unique = true)
	private String name;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "animal_id")
	private Animal animal;
	
	@NotNull
	private int numOfAnimals;
	
	@NotNull
	private int feedTime;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "enclosureCondition_id")
	private EnclosureCondition condition;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public int getNumOfAnimals() {
		return numOfAnimals;
	}
	public void setNumOfAnimals(int numOfAnimals) {
		this.numOfAnimals = numOfAnimals;
	}
	public int getFeedTime() {
		return feedTime;
	}
	public void setFeedTime(int feedTime) {
		this.feedTime = feedTime;
	}
	public EnclosureCondition getCondition() {
		return condition;
	}
	public void setCondition(EnclosureCondition condition) {
		this.condition = condition;
	}

}
