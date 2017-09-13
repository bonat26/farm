package com.at.farm.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Production {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	private Boolean state;
	
	private Integer price;
}
