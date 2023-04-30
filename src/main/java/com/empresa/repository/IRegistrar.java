package com.empresa.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.empresa.entity.registrar;
@Repository
public interface IRegistrar extends JpaRepository<registrar, Integer>{

	/*public List<registrar>findByDni(String dni);*/
	@Query("select e from registrar e where e.dni = ?1" )
	public List<registrar>listaPorDni(String dni);
}
