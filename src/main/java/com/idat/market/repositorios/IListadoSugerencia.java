package com.idat.market.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.idat.market.modelos.ListadoSugerencias;

public interface IListadoSugerencia extends JpaRepository<ListadoSugerencias, Integer>{
	@Query(value="{call listar_sugerencias()}", nativeQuery = true)
	List<ListadoSugerencias> ListarSugerenciasGeneral();
	

}
