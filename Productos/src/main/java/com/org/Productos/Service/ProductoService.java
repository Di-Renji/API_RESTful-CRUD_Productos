package com.org.Productos.Service;

import com.org.Productos.Model.Producto;
import com.org.Productos.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repository;

    // Listar Productos
    public List<Producto> listarProductos(){
        return repository.findAll();
    }
    // Guardar Productos
    public void guardarProducto(Producto producto){
        repository.save(producto);
    }
    // Obtener Producto por ID
    public Producto obtenerProductoPorId(Integer id){
        return repository.findById(id).get();
    }
    // Eliminar Productos
    public void eliminarProducto(Integer id){
        repository.deleteById(id);
    }

}