package com.rodolfogomes.diolive.controller;

import com.rodolfogomes.diolive.model.Jornada;
import com.rodolfogomes.diolive.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaController {

   @Autowired
   JornadaService jornadaService;

    @PostMapping
    public ResponseEntity<Jornada> criaJornada(@RequestBody final  Jornada jornada) {
        return ResponseEntity.ok(jornadaService.salvar(jornada));
    }

    @GetMapping
    public List<Jornada> listarJornada() {
        return jornadaService.listar();
    }

    @GetMapping("/{idjornada}")
    public ResponseEntity<?> listarJornadaPorId(@PathVariable("idjornada") final long idJornada) {
        return ResponseEntity.ok(jornadaService.listarPorIdCategoria(idJornada));
    }

    @PutMapping
    public ResponseEntity<Jornada> atualizarJornada(@RequestBody final Jornada jornada) {
        jornadaService.atualizar(jornada);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{idjornada}")
    public ResponseEntity<Jornada> deletarJornada(@PathVariable("idjornada") final long idJornada) {
        jornadaService.deletar(idJornada);
        return ResponseEntity.ok().build();
    }

}
