package com.aplicacion_web.crud.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aplicacion_web.crud.Entidad.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
