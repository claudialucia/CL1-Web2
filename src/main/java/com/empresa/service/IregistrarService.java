package com.empresa.service;

import java.util.List;


import com.empresa.entity.registrar;

public interface IregistrarService {

	public abstract List<registrar>listar();
	
	public abstract registrar insertaDocente(registrar obj);
	
	public abstract List<registrar>listaDocentePorDni(String dni);
}
