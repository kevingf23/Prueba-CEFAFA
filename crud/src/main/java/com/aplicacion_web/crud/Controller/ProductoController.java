package com.aplicacion_web.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aplicacion_web.crud.Entidad.Producto;
import com.aplicacion_web.crud.Service.ProductoService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping
    public List<Producto> listaProductos() {

        return productoService.listaProducto();
    }

    @PostMapping
    public Producto guardaProducto (@RequestBody Producto producto) {

        return productoService.guardaProducto(producto);
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto (@PathVariable Integer id, @RequestBody Producto producto) {

        return productoService.actualizarProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public void eliminaProducto (@PathVariable Integer id) {

        productoService.eliminaProducto(id);
    }
    
}
