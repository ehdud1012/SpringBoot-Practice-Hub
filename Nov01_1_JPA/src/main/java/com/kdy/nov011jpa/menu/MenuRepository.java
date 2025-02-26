package com.kdy.nov011jpa.menu;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Integer>{
	public abstract List<Menu> findAll(Pageable p);
}
