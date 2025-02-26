package com.kdy.n252.jAJAX.drink;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Drinks {
	private List<Drink> drink;

	public Drinks() {
		// TODO Auto-generated constructor stub
	}
	
	public Drinks(List<Drink> drink) {
		super();
		this.drink = drink;
	}

	public List<Drink> getDrink() {
		return drink;
	}

	@XmlElement
	public void setDrink(List<Drink> drink) {
		this.drink = drink;
	}
}
