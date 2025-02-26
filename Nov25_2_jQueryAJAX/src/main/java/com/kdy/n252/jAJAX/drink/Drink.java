package com.kdy.n252.jAJAX.drink;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity(name = "nov25_drink")
public class Drink {
	@Id
	@Column(name = "d_name")
	private String name;
	@Column(name = "d_price")
	private Integer price;
	
	public Drink() {
		// TODO Auto-generated constructor stub
	}
	
	public Drink(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}
	
	@XmlElement
	public void setPrice(Integer price) {
		this.price = price;
	}
}
