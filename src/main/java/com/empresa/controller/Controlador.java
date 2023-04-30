package com.empresa.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.registrar;
import com.empresa.service.IregistrarService;



@RestController
@RequestMapping("/rest/registrar")
public class Controlador {
	
@Autowired
private IregistrarService service;

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<registrar>>listar() {	
		List<registrar>lista=service.listar();
		return ResponseEntity.ok(lista);
}
	/*
	@GetMapping("/{dni}")
	@ResponseBody
	public ResponseEntity<List<registrar>>listaPorDni(@PathVariable (name= "dni")String dni) {		
	return ResponseEntity.ok(service.listaDocentePorDni(dni));
}*/
	@PostMapping
	@ResponseBody
	public ResponseEntity<HashMap<String, Object>>insertaDocente(@RequestBody registrar obj){
		HashMap<String,Object>salida=new HashMap<String,Object>();
		
		try {
			List<registrar>listaDocente=service.listaDocentePorDni(obj.getDni());
			if(CollectionUtils.isEmpty(listaDocente)) {
				obj.setIddocente(0);
				registrar objSalida=service.insertaDocente(obj);
				if(objSalida==null) {
					salida.put("mensaje", "Error en el registro");
				}else {
					salida.put("mensaje", "REGISTRO EXITOSO!!!");
				}
			}else {
				salida.put("mensaje", "el DNI ya existe :" +obj.getDni());
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error en el registro :"+e.getMessage());
		}
		
		return ResponseEntity.ok(salida);
	}
}