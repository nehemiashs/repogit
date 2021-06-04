package com.idat.market.repositorios;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.idat.market.modelos.sugerencias;


public interface ISugerencia  extends JpaRepository<sugerencias, Integer>{
	@Query(value="{call ListarSugerenciaUsuario(:dni)}", nativeQuery = true)
	List<sugerencias> ListarSugerencias(@Param("dni") int dni);
	
}
