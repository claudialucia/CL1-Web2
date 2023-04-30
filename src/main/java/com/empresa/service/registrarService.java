package com.empresa.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.registrar;
import com.empresa.repository.IRegistrar;

@Service
public class registrarService implements IregistrarService{
	
	@Autowired
	private IRegistrar repository;
	
	@Override
	public List<registrar> listar() {
	
		return repository.findAll();
	}

	@Override
	public registrar insertaDocente(registrar obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	@Override
	public List<registrar> listaDocentePorDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}


