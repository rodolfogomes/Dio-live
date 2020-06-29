package com.rodolfogomes.diolive.controller;

import com.rodolfogomes.diolive.model.CategoriaUsuario;
import com.rodolfogomes.diolive.repository.CategoriaUsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioRepository categoriaUsuarioRepository;

    @PostMapping
    public void criaCategoria(@RequestBody CategoriaUsuario categoriaUsuario){
        categoriaUsuarioRepository.save(categoriaUsuario);

    }
    
}