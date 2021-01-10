package com.devsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Product;

//implementa todas as operações basicas relacionadas ao banco de dados com relação produto
public interface OrderRepository extends JpaRepository<Product, Long>{

}
