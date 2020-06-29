package com.rodolfogomes.diolive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
public class CategoriaUsuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;
    
}