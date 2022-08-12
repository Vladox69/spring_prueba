package com.ecovlad.api.apirest.proceso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcesoController {

	@Autowired
	private ProcesoService proceso_service;
	
	@GetMapping("api/procesos")
	public List<Proceso> getProcesos(){
		return proceso_service.getProcesos();
	}
	
}
