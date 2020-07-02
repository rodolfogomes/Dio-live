package com.rodolfogomes.diolive.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Jornada {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;
}
