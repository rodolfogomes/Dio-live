package com.rodolfogomes.diolive.controller;

import com.rodolfogomes.diolive.model.CategoriaUsuario;
import com.rodolfogomes.diolive.model.Empresa;
import com.rodolfogomes.diolive.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public ResponseEntity<Empresa> criaJornada(@RequestBody final Empresa empresa) {
        return ResponseEntity.ok(empresaService.salvar(empresa));
    }

    @GetMapping
    public List<Empresa> listarJornada() {
        return empresaService.listar();
    }

    @GetMapping("/{idempresa}")
    public ResponseEntity<?> listarJornadaPorId(@PathVariable("idempresa") final long idEmpresa) {
        return ResponseEntity.ok(empresaService.listarPorIdCategoria(idEmpresa));
    }

    @PutMapping
    public ResponseEntity<Empresa> atualizarJornada(@RequestBody final Empresa empresa) {
        empresaService.atualizar(empresa);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{idempresa}")
    public ResponseEntity<CategoriaUsuario> deletarJornada(@PathVariable("idempresa") final long idEmpresa) {
        empresaService.deletar(idEmpresa);
        return ResponseEntity.ok().build();
    }


}
