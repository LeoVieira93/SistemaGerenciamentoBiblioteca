package com.br.fullstackeducationM1S09.M1S09.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "visitantes")
public class VisitanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "nome", nullable = false)
    private String nome;
    @JoinColumn(name = "telefone", nullable = false)
    private String telefone;

}
