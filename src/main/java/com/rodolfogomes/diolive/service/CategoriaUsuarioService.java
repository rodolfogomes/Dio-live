package com.rodolfogomes.diolive.service;

import java.util.List;

import com.rodolfogomes.diolive.model.CategoriaUsuario;
import com.rodolfogomes.diolive.repository.CategoriaUsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CategoriaUsuarioService {
    @Autowired
    CategoriaUsuarioRepository categoriaUsuarioRepository;

	public CategoriaUsuario salvar(final CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepository.save(categoriaUsuario);
	}

	public List<CategoriaUsuario> listar() {
		return categoriaUsuarioRepository.findAll();
	}

	public CategoriaUsuario listarPorIdCategoria(long idCategoria) {
       return pegarCategoria(idCategoria);  
    }
    
	public void atualizar(CategoriaUsuario categoriaUsuario) {
        categoriaUsuarioRepository.save(categoriaUsuario);
    }
    
	public void deletar(long idCategoria) {
        categoriaUsuarioRepository.delete(pegarCategoria(idCategoria));
    }
    
    private CategoriaUsuario pegarCategoria(long idUsuario){
        return categoriaUsuarioRepository.findById(idUsuario).orElse(new CategoriaUsuario());
    }


    
}