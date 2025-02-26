package com.kdy.nov011jpa.menu;

import com.kdy.nov011jpa.restaurant.Restaurant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "nov01_menuu")
public class Menu {
	@Id			// 시퀀스 쓰는 방법			DB연결			 자바에서 쓸 이름    몇씩 올라갈건지
	@SequenceGenerator(sequenceName = "NOV01_MENUU_seq", name = "nms", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nms")
	@Column(name = "m_no")
	private Integer no;
	@Column(name = "m_name")
	private String name;
	@Column(name = "m_price")
	private Integer price;
	
	@ManyToOne
	@JoinColumn(name = "m_r_name")
	private Restaurant res;
}
