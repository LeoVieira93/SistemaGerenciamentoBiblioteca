package com.br.fullstackeducationM1S09.M1S09.Repository;

import com.br.fullstackeducationM1S09.M1S09.Entity.BibliotecarioEntity;
import com.br.fullstackeducationM1S09.M1S09.Entity.BibliotecarioEntity;
import com.br.fullstackeducationM1S09.M1S09.Entity.LivroEntity;
import com.br.fullstackeducationM1S09.M1S09.Entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface  BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {

    @Query("update BibliotecarioEntity bibliotecario set " +
            " bibliotecario.nome = :nome," +
            " bibliotecario.email = :email," +
            " bibliotecario.senha = :senha " +
            "where bibliotecario.id = :id")
    BibliotecarioEntity update(@Param("nome") String nome,
                               @Param("senha") Long senha,
                               @Param("email") String email,
                               @Param("id") Long id);

    BibliotecarioEntity update(Long id, String nome, String email);
}
