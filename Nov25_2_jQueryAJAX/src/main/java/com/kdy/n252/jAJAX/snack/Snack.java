package com.kdy.n252.jAJAX.snack;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "nov25_snack")
public class Snack {
	@Id
	@Column(name = "s_name")
	private String name;
	
	@Column(name = "s_price")
	private Integer price;
}