package com.palpa.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.palpa.demo.model.Categorias;

@Repository
public interface ICategorias extends CrudRepository<Categorias,Integer>{

	
}