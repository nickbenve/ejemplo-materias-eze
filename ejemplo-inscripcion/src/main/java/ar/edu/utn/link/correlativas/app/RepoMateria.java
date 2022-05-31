package ar.edu.utn.link.correlativas.app;


import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import ar.edu.utn.link.correlativas.model.Materia;


public interface RepoMateria extends PagingAndSortingRepository<Materia, Integer> {

	Page<Materia> findAll(Pageable page);

	Materia findByNombre(String nombre);
	
	Page<Materia> findByAnio(Integer anio,Pageable page);
	
	Materia findByNombreAndAnio(String nombre,Integer anio);
	
}
