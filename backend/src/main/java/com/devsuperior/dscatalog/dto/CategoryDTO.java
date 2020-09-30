package com.devsuperior.dscatalog.dto;

import java.io.Serializable;

import com.devsuperior.dscatalog.entities.Category;

/**
 * controlar quais dados que vou jogar para o controller
 * e a API vai disponibilizar para as aplicações web/mobile
 * @author Bia Coelho
 *
 */
public class CategoryDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	//private CategoryDTO() {}

	public CategoryDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * vai povoar o CategoryDTO simplesmente
	 * passando uma entidade como argumento
	 * @param entity 
	 */
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
