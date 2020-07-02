package com.rodolfogomes.diolive.service;

import com.rodolfogomes.diolive.model.Jornada;
import com.rodolfogomes.diolive.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class JornadaService {

    @Autowired
    JornadaRepository jornadaRepository;

    public Jornada salvar(Jornada jornada) {
        return jornadaRepository.save(jornada);
    }

    public List<Jornada> listar() {
        return jornadaRepository.findAll();
    }

    public Jornada listarPorIdCategoria(long idJornada) {
        return jornadaRepository.findById(idJornada).orElseThrow(() -> new NoSuchElementException());
    }

    public Jornada atualizar(Jornada jornada) {
        return jornadaRepository.save(jornada);
    }

    public void deletar(long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
}
