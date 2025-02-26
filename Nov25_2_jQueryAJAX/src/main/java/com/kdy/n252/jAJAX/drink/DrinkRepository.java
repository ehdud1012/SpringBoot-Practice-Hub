package com.kdy.n252.jAJAX.drink;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends CrudRepository<Drink, String>{
	public abstract List<Drink> findAll();
}
