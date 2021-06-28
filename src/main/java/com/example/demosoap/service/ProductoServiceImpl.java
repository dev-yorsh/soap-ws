package com.example.demosoap.service;

import com.example.demosoap.model.ProductoModel;
import com.example.demosoap.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tempuri.purchaseorderschema.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public Producto getProducto(String name) {
        ProductoModel prod1 = buscarProducto(name);
        Producto prod = new Producto();
        prod.setNombre(prod1.getNombre());
        prod.setPrecio(prod1.getPrecio());
        prod.setCategoria(prod1.getCategoria());
        prod.setId(prod1.getId());
        return prod;
    }

    @Override
    public ProductoModel buscarProducto(String nombre) {
        return productoRepository.findByNombre(nombre);
    }
}
