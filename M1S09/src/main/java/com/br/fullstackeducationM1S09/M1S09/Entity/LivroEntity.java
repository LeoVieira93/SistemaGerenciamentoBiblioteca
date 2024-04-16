package com.br.fullstackeducationM1S09.M1S09.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@Table(name = "livros")
public class LivroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "titulo", nullable = false)
    private String titulo;
    @JoinColumn(name = "autor", nullable = false)
    private String autor;
    @JoinColumn(name = "ano_publicacao", nullable = false)
    private Integer anoPub;

    public LivroEntity(String titulo, String autor, LocalDate anoPub) {
    }
}
