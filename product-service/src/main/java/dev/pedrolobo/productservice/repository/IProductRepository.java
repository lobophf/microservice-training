package dev.pedrolobo.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.pedrolobo.productservice.model.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{

}
