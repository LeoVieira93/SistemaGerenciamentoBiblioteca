package com.br.fullstackeducationM1S09.M1S09.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@Table(name = "membros")
public class MembroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "nome", nullable = false)
    private String nome;
    @JoinColumn(name = "endereco", nullable = false)
    private String endereco;
    @JoinColumn(name = "telefone", nullable = false)
    private String telefone;

}
