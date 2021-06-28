package com.example.demosoap.endpoint;

import com.example.demosoap.service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.tempuri.purchaseorderschema.ProductoRequest;
import org.tempuri.purchaseorderschema.ProductoResponse;

@Endpoint
public class ProductoEndpoint {

    @Autowired
    private ProductoServiceImpl productoService;

    @PayloadRoot(namespace = "http://tempuri.org/PurchaseOrderSchema", localPart = "productoRequest")
    @ResponsePayload
    public ProductoResponse getProducto(@RequestPayload ProductoRequest productoRequest){
        ProductoResponse productoResponse = new ProductoResponse();
        productoResponse.setProducto(productoService.getProducto(productoRequest.getNombre()));
        return  productoResponse;
    }
}
