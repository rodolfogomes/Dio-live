package com.rodolfogomes.diolive.repository;

import com.rodolfogomes.diolive.model.Jornada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<Jornada,Long> {
}
