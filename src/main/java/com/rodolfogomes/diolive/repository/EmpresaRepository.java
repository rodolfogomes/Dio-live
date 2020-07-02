package com.rodolfogomes.diolive.repository;

import com.rodolfogomes.diolive.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Long> {
}
