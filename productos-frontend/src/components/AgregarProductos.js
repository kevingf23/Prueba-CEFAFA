import React, {useState} from "react";
import axios from "axios";

const AgregarProducto = () => {

    const [producto, setProducto] = useState({nombre_producto: '', descripcion_producto: '', precio_producto: '', categoria_producto: ''});

    const handleChange = (e) => {

        setProducto({...producto, [e.target.name]: e.target.value});
    };

    const handleSubmit = async (e) => {

        e.preventDefault();

        try {

            await axios.post('http://localhost:8080/api/productos', producto, {
                headers: {
                    'Content-Type': 'application/json',
                }
            });
            alert('Producto agregado exitosamente');

        } catch (error) {

            console.error('Error al agregar el producto', error);
        }
    };


    return (
        
        <form onSubmit={handleSubmit}>
            <input type="text" name="nombre_producto" placeholder="Nombre" onChange={handleChange}></input>
            <input type="text" name="descripcion_producto" placeholder="Descripcion" onChange={handleChange}></input>
            <input type="number" name="precio_producto" placeholder="Precio" onChange={handleChange}></input>
            <input type="text" name="categoria_producto" placeholder="Categoria" onChange={handleChange}></input>
            <button type="submit">Agregar producto</button>
        </form>
    );
};

export default AgregarProducto;