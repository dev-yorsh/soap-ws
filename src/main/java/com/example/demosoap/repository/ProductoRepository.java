package com.example.demosoap.repository;

import com.example.demosoap.model.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoModel, Integer> {

    //@Query( name = "select * from Producto where ..")
    ProductoModel findByNombre(String nombre);
}
