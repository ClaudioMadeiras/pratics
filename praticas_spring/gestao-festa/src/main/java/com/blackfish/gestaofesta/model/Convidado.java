package com.blackfish.gestaofesta.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Convidado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "quantidade_acompanhantes", nullable = false)
    private Integer quantidadeAcompanhantes;
}
