package com.br.fullstackeducationM1S09.M1S09.Repository;

import com.br.fullstackeducationM1S09.M1S09.Entity.EmprestimoEntity;
import com.br.fullstackeducationM1S09.M1S09.Entity.EmprestimoEntity;
import com.br.fullstackeducationM1S09.M1S09.Entity.LivroEntity;
import com.br.fullstackeducationM1S09.M1S09.Entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {


    @Query("update EmprestimoEntity emprestimo set " +
            " emprestimo.membro = :membro," +
            " emprestimo.livro = :livro," +
            " emprestimo.dataEmprestimo = :dataEmprestimo, " +
            " emprestimo.dataDevolucao = :dataDevolucao " +
            "where emprestimo.id = :id")
    EmprestimoEntity update(@Param("membro") MembroEntity membro,
                            @Param("livro") LivroEntity livro,
                            @Param("data_emprestimo") LocalDate dataEmprestimo,
                            @Param("data_devolucao") LocalDate dataDevolucao);

    EmprestimoEntity update(Long id, LivroEntity livro, MembroEntity membro, LocalDate dataEmprestimo, LocalDate dataDevolucao);
}
