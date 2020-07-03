package com.rodolfogomes.diolive.service;

import com.rodolfogomes.diolive.model.CategoriaUsuario;
import com.rodolfogomes.diolive.model.NivelAcesso;
import com.rodolfogomes.diolive.repository.NivelAcessoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelAcessoService {

    NivelAcessoRepository nivelAcessoRepository;

    public NivelAcesso salvar(final NivelAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public List<NivelAcesso> listar() {
        return nivelAcessoRepository.findAll();
    }

    public NivelAcesso listarPorIdNivelAcesso(long idNivelAcesso) {
        return pegarCategoria(idNivelAcesso);
    }

    public void atualizar(NivelAcesso nivelAcesso) {
        nivelAcessoRepository.save(nivelAcesso);
    }

    public void deletar(long idCategoria) {
        nivelAcessoRepository.delete(pegarCategoria(idCategoria));
    }

    private NivelAcesso pegarCategoria(long idNivelAcesso){
        return nivelAcessoRepository.findById(idNivelAcesso).orElse(new NivelAcesso());
    }
}
