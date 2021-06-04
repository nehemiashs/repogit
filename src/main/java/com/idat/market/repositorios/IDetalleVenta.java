package com.idat.market.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.market.modelos.DetalleVenta;

public interface IDetalleVenta extends JpaRepository<DetalleVenta, Integer>{

}
