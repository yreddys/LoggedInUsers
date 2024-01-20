package com.Yarraneella.Hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Yarraneella.Hotel.entity.StudentEnq;

public interface StudentEnqRepo extends JpaRepository<StudentEnq, Integer>{
	
	public List<StudentEnq> findByCid(Integer cid);
	
}
