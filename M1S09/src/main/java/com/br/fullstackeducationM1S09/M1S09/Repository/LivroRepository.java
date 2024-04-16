package com.br.fullstackeducationM1S09.M1S09.Repository;

import com.br.fullstackeducationM1S09.M1S09.Entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
    @Query("update LivroEntity livro set " +
            "livro.titulo = :titulo," +
            "livro.autor = :autor," +
            "livro.anoPub = :anoPub " +
            "where livro.id = :id")
    LivroEntity update(@Param("titulo") String titulo,
                       @Param("autor") String autor,
                       @Param("anoPub") Integer anoPub,
                       @Param("id") Long id);

    LivroEntity update(Long id, String titulo, Integer anoPub);
}
