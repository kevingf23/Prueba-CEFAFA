package com.aplicacion_web.crud.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_producto;
    private String nombre_producto;
    private String descripcion_producto;
    private Double precio_producto;
    private String categoria_producto;



    
    public int getId_producto() {
        return id_producto;
    }
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    public String getNombre_producto() {
        return nombre_producto;
    }
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    public String getDescripcion_producto() {
        return descripcion_producto;
    }
    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }
    public Double getPrecio_producto() {
        return precio_producto;
    }
    public void setPrecio_producto(Double precio_producto) {
        this.precio_producto = precio_producto;
    }
    public String getCategoria_producto() {
        return categoria_producto;
    }
    public void setCategoria_producto(String categoria_producto) {
        this.categoria_producto = categoria_producto;
    }

    
    
    
}
