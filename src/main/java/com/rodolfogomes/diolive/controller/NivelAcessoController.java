package com.rodolfogomes.diolive.controller;

import com.rodolfogomes.diolive.model.NivelAcesso;
import com.rodolfogomes.diolive.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acesso")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public ResponseEntity<NivelAcesso> criaCategoria(@RequestBody final NivelAcesso nivelAcesso) {
        return ResponseEntity.ok(nivelAcessoService.salvar(nivelAcesso));
    }

    @GetMapping
    public List<NivelAcesso> listarCategoriaNivelAcesso() {
        return nivelAcessoService.listar();
    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<?> listarCategoriaUsuarioPorNivelAcesso(@PathVariable("idNivelAcesso") final long idNivelAcesso) {
        return ResponseEntity.ok(nivelAcessoService.listarPorIdNivelAcesso(idNivelAcesso));
    }

    @PutMapping
    public ResponseEntity<NivelAcesso> atualizarCategoria(@RequestBody final NivelAcesso NivelAcesso) {
        nivelAcessoService.atualizar(NivelAcesso);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{idCategoria}")
    public ResponseEntity<NivelAcesso> deletarCategoria(@PathVariable("idNivelAcesso") final long idNivelAcesso) {
        nivelAcessoService.deletar(idNivelAcesso);
        return ResponseEntity.ok().build();
    }


}
