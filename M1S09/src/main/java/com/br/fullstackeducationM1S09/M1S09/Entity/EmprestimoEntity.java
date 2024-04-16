package com.br.fullstackeducationM1S09.M1S09.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@Table(name = "emprestimos")
public class EmprestimoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private LivroEntity livro;
    @ManyToOne
    private MembroEntity membro;
    @JoinColumn(name = "data_emprestimo", nullable = false)
    private LocalDate dataEmprestimo;
    @JoinColumn(name = "data_devolucao", nullable = false)
    private LocalDate dataDevolucao;

}
