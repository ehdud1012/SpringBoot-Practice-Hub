package com.kdy.oct311jpa.snack;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// MyBatis 
//		mapper.xml에 SQL쓰고, interface에 연결
// JPA
//		SQL 다 똑같은데 직접?

@Repository										 // java bean, pk 자료형
public interface SnackRepository extends CrudRepository<Snack, String>{
	// 기존 findAll()이 우리한테 안맞음 -> overriding 사용
	public abstract List<Snack> findAll();
	
	// select
	public abstract List<Snack> findByPriceLessThanEqual(Integer i, Pageable p);
	public abstract List<Snack> findByNameContaining(String s);
	public abstract List<Snack> findByNameStartingWith(String s);

}
