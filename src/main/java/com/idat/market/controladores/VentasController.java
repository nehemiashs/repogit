package com.idat.market.controladores;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.market.modelos.DetalleVenta;
import com.idat.market.modelos.ventas;
import com.idat.market.repositorios.IDetalleVenta;
import com.idat.market.repositorios.IVentas;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping()
public class VentasController {
	
	@Autowired
	private IVentas Ventas;
	@Autowired
	private IDetalleVenta DetalleVentas;
	
	
	@GetMapping("/listarventas")
	public List<ventas> ListarVentas() {
		return this.Ventas.findAll();
	}
	
	@PostMapping("/registrarventas")
	public ventas RegistrarVenta(@RequestBody ventas venta) {
		return this.Ventas.save(venta);
	}
	
	@GetMapping("/listardetalleventas")
	public List<DetalleVenta> ListarDetalleVentas() {
		return this.DetalleVentas.findAll();
	}
	
	@PostMapping("/registrardetalleventa")
	public DetalleVenta RegistrarVenta(@RequestBody DetalleVenta detalle) {
		return this.DetalleVentas.save(detalle);
	}
	
}
