package com.cg.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.demo.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
