package br.com.everymind.nunessports.repository;

import br.com.everymind.nunessports.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> { }