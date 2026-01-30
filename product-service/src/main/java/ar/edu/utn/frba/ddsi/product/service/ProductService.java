package ar.edu.utn.frba.ddsi.product.service;

import ar.edu.utn.frba.ddsi.product.dto.request.CreateProductRequest;
import ar.edu.utn.frba.ddsi.product.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse create(CreateProductRequest request);

    ProductResponse findById(Long id);

    List<ProductResponse> findAll();

    ProductResponse update(Long id, CreateProductRequest request);

    void delete(Long id);

    List<ProductResponse> searchByName(String name);
}
