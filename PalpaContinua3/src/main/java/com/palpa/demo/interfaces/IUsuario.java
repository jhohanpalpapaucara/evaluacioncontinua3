package com.palpa.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.palpa.demo.model.Usuario;

@Repository
public interface IUsuario extends CrudRepository <Usuario,Integer>{

	Usuario findBynombre(String nombre);
}