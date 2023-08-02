package com.org.Productos.Controller;
import com.org.Productos.Model.Producto;
import com.org.Productos.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("producto")

public class ProductoController {

    @Autowired
    private ProductoService service;

    // LISTAR PRODUCTOS
    @GetMapping("/listar")
    public List<Producto> listarProductos(){
        return service.listarProductos();
    }

    /* PRIMERA FORMA PARA OBTENER POR ID
    @GetMapping("/obtener/{id}")
    public Producto obtenerProducto(@PathVariable Integer id){
    return service.obtenerProductoPorId(id);
    }*/

    // OBTENER PRODUCTO POR ID
    @GetMapping("/obtener/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Integer id){
        try{
            Producto producto = service.obtenerProductoPorId(id);
            return new ResponseEntity<Producto>(producto, HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
        }
    }

    // REGISTRAR PRODUCTO
    @PostMapping("/registrar")
    public void guardarProducto(@RequestBody Producto producto){
        service.guardarProducto(producto);
    }

    // ELIMINAR PRODUCTO
    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable Integer id){
        service.eliminarProducto(id);
    }

    // ACTUALIZAR PRODUCTO
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizarProducto(@RequestBody Producto producto, @PathVariable Integer id){
        try {
            Producto productoExistente = service.obtenerProductoPorId(id);
            productoExistente.setNombre(producto.getNombre());
            productoExistente.setPrecio(producto.getPrecio());
            service.guardarProducto(productoExistente);
            return new ResponseEntity<Producto>(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
        }
    }

}
