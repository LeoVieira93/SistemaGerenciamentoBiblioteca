package com.br.fullstackeducationM1S09.M1S09.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "bibliotecarios")
public class BibliotecarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "nome", nullable = false)
    private String nome;
    @JoinColumn(name = "email", nullable = false)
    private String email;
    @JoinColumn(name = "senha", nullable = false)
    private Long senha;

}
