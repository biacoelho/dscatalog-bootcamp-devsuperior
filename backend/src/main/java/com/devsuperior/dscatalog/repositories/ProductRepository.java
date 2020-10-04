package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.entities.Product;

/** Classe resposável por acessar o banco de dados
 * os objetos do tipo ProductRepository passa a
 * ser gerenciados pelo spring
 * @author Bia Coelho
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
