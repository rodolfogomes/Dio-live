package com.rodolfogomes.diolive.repository;

import com.rodolfogomes.diolive.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso,Long> {
}
