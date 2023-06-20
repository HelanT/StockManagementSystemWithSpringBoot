package com.takeo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="SHOP")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	@Column(name="OWNERNAME")
	private String ownerName;
	@Column(name="SHOPNO")
	private long shopNo;
	@Column(name="SHOPTYPE")
	private String shopType;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="COUNTRY")
	private String country;
	
	

}
