package com.idat.market.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.market.modelos.categorias;
import com.idat.market.modelos.productos;
import com.idat.market.modelos.proveedores;
import com.idat.market.repositorios.ICategorias;
import com.idat.market.repositorios.IListarProveedores;
import com.idat.market.repositorios.IProductos;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping()
public class ProductosController {
	
	@Autowired
	private IProductos Productos;
	@Autowired
	private ICategorias Categorias;
	@Autowired IListarProveedores Proveedores;
	
	@GetMapping("/listarproductos")
	public List<productos> listarproductos() {
		return this.Productos.findAll();
	}
	
	@GetMapping("/listarcategorias")
	public List<categorias> listarCategorias() {
		return this.Categorias.findAll();
	}

	@PostMapping("/registrarproductos")
	public productos RegistrarProductos(@RequestBody productos prod) {
		return this.Productos.save(prod);
	}
	
	@GetMapping("/listarproveedores")
	public List<proveedores> listarproveedores() {
		return this.Proveedores.findAll();
	}
	
	@GetMapping("/actualizarproductos")
	public productos ActualizarProductos(@RequestBody productos prod) {
		return this.Productos.save(prod);
	}

}
