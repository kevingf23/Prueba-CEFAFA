import logo from './logo.svg';
import './App.css';
import React from 'react';
import ListaProductos from './components/ListaProductos';
import AgregarProducto from './components/AgregarProductos';

function App() {
  return (
    <div className='App'>

      <h1>Gestion de producto</h1>
      <AgregarProducto></AgregarProducto>
      <ListaProductos></ListaProductos>

    </div>
  );
}

export default App;
