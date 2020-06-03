package com.example.database.repository;

import java.util.List;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.database.model.Emp;
import com.example.database.model.bottle;


@Repository
public interface emp_repo extends JpaRepository<Emp, Integer>{
	
	@Query(value="select k from Emp k where k.SAL > ?1 ")
	public List<Emp> getAllemp(Float number);
	
	@Query(value="select k from Emp k")
	public List<Emp> getEmployees(Pageable page);
	
	
	@Query(value="select k from Emp k where k.JOB = ?1 ")
	public List<Emp> getByJob(String job);
	
	@Query(value="select k from Emp k where k.EMPNO = ?1 ")
	public List<Emp> getByEmpno(int number);

}
