package com.idat.market.controladores;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.market.modelos.usuario;
import com.idat.market.repositorios.IUsuario;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping()
public class AutenticationController {
	
	@Autowired
	private IUsuario Usuario;
	
	@GetMapping("/autentication/{email}/{password}")
	public usuario autentication(@PathVariable(value="email") String email, @PathVariable(value="password") String password) {
		return this.Usuario.Autentication(email, password);
	}
}
