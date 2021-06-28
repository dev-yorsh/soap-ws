package com.example.demosoap.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class ProductoModel {

    @Id
    private Integer id;
    private String nombre;
    private String categoria;
    private Double precio;

}
