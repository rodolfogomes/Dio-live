package com.rodolfogomes.diolive.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {
    @Id
    @Generated
    private Long id;
    private String descricao;
    @Length(max = 11,message = "O cnpj não pode ser maior que {max} caracteres.")
    @NotNull
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}

