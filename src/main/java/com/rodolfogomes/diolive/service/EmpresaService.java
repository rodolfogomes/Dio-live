package com.rodolfogomes.diolive.service;

import com.rodolfogomes.diolive.model.Empresa;
import com.rodolfogomes.diolive.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa salvar(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public List<Empresa> listar() {
        return empresaRepository.findAll();
    }

    public Empresa listarPorIdCategoria(long idEmpresa) {
        return empresaRepository.findById(idEmpresa).orElseThrow(() -> new NoSuchElementException());
    }

    public Empresa atualizar(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public void deletar(long idEmpresa) {
        empresaRepository.deleteById(idEmpresa);
    }
}



