package com.ecovlad.api.apirest.proceso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcesoRepository extends JpaRepository<Proceso, Integer>{

}
