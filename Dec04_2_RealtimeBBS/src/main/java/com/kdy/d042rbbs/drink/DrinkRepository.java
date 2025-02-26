package com.kdy.d042rbbs.drink;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DrinkRepository extends CrudRepository<Drink, String>{
	public abstract List<Drink> findAll();
}
