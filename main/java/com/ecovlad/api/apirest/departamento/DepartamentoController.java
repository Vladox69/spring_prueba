package com.ecovlad.api.apirest.departamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartamentoController {
	
	@Autowired
	private DepartamentoService departamento_service;
	
	@GetMapping("api/departamentos")
	public List<Departamento> getDepartamentos(){
		
		return departamento_service.getDepartamentos();
	}
}
