package com.ecovlad.api.apirest.proceso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcesoService {

	@Autowired
	private ProcesoRepository proceso_repository;
	
	public List<Proceso> getProcesos(){
		return proceso_repository.findAll();
	}
	
}
