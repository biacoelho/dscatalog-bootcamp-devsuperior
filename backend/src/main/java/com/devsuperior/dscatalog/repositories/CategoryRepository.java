package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.entities.Category;

/**
 * os objetos do tipo CategoryRepository passa a ser gerenciados
 * pelo spring
 * @author Bia Coelho
 */

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
