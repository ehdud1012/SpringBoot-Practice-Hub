package com.kdy.d042rbbs.drink;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "dec04_drink")
public class Drink {
	@Id
	@Column(name = "d_name")
	private String name;
	@Column(name = "d_price")
	private Integer price;
}
