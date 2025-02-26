package com.kdy.nov011jpa.restaurant;
import java.util.List;
import com.kdy.nov011jpa.menu.Menu;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "nov01_restaurant")
public class Restaurant {
	@Id
	@Column(name = "r_name")
	private String name;
	@Column(name = "r_addr")
	private String addr;
	
	@OneToMany(mappedBy = "res")
	private List<Menu> m;
}
