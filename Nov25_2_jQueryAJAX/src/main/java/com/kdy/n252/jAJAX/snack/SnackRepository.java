package com.kdy.n252.jAJAX.snack;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SnackRepository extends CrudRepository<Snack, String>{
	public abstract List<Snack> findAll();
	public abstract List<Snack> findByPriceGreaterThanEqual(Integer i);
}
