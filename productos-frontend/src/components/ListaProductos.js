import React, {useState, useEffect} from "react";
import axios from "axios";

const ListaProductos = () => {

    const [productos, setProductos] = useState([]);

    useEffect(() => {

        const obtenerProductos = async () => {

            try {

                const respuesta = await axios.get('http://localhost:8080/api/productos');
                setProductos(respuesta.data);

            }catch (error) {

                console.error('Error al obtener los productos', error);

            }
        };

        obtenerProductos();
    }, []);

    return (

        <div>
            <h1>Lista de productos</h1>
            <ul>
                {productos.map(producto => (
                    <li key={producto.id_producto}>{producto.nombre_producto} -- ${producto.precio_producto} --{producto.categoria_producto}</li>
                ))}
            </ul>
        </div>
    );
};

export default ListaProductos