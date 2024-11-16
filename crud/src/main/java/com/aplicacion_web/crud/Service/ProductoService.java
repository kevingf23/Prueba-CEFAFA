package com.aplicacion_web.crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplicacion_web.crud.Entidad.Producto;
import com.aplicacion_web.crud.Repositorio.ProductoRepository;

@Service
public class ProductoService {
    

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listaProducto() {

        return productoRepository.findAll();
    }

    public Producto guardaProducto(Producto producto) {

        return productoRepository.save(producto);
    }

    public Producto actualizarProducto(Integer id, Producto producto) {

        producto.setId_producto(id);

        return productoRepository.save(producto);
    }

    public void eliminaProducto(Integer id) {

        productoRepository.deleteById(id);
    }
}
