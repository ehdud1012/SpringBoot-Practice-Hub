package com.kdy.nov011jpa.restaurant;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository	
public interface RestaurantRepository extends CrudRepository<Restaurant, String>{
	public abstract List<Restaurant> findAll();
	public abstract List<Restaurant> findAll(Pageable p);
}
