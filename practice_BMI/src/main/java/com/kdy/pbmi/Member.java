package com.kdy.pbmi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Member {
	private String name;
	private Double height;
	private Double weight;
	private String bmi;
	private String result;
}
