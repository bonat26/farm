package com.at.farm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Chicken {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String type;
	
	@ManyToOne
	private User user;
	
	private String frecuency;
}
