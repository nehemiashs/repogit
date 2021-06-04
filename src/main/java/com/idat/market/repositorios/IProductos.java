package com.idat.market.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.market.modelos.productos;

public interface IProductos extends JpaRepository<productos, Integer>{

}
