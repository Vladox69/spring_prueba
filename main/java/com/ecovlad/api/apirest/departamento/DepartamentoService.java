package com.ecovlad.api.apirest.departamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService {
	
	@Autowired
	private DepartamentoRepository departamento_repository;
	
	public List<Departamento> getDepartamentos(){
		return departamento_repository.findAll();
	}
	
}
