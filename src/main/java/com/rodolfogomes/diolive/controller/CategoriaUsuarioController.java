package com.rodolfogomes.diolive.controller;

import java.util.List;
import com.rodolfogomes.diolive.model.CategoriaUsuario;
import com.rodolfogomes.diolive.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/categoria")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public ResponseEntity<CategoriaUsuario> criaCategoria(@RequestBody final CategoriaUsuario categoriaUsuario) {
        return ResponseEntity.ok(categoriaUsuarioService.salvar(categoriaUsuario));
    }

    @GetMapping
    public List<CategoriaUsuario> listarCategoriaUsuario() {
        return categoriaUsuarioService.listar();
    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<?> listarCategoriaUsuarioPorUsuario(@PathVariable("idCategoria") final long idCategoria) {
        return ResponseEntity.ok(categoriaUsuarioService.listarPorIdCategoria(idCategoria));
    }

    @PutMapping
    public ResponseEntity<CategoriaUsuario> atualizarCategoria(@RequestBody final CategoriaUsuario categoriaUsuario) {
        categoriaUsuarioService.atualizar(categoriaUsuario);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> deletarCategoria(@PathVariable("idCategoria") final long idCategoria) {
        categoriaUsuarioService.deletar(idCategoria);
        return ResponseEntity.ok().build();
    }
    
}