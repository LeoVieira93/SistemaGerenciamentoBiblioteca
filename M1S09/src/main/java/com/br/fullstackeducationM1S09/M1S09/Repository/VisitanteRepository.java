package com.br.fullstackeducationM1S09.M1S09.Repository;

import com.br.fullstackeducationM1S09.M1S09.Entity.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {

    @Query("update VisitanteEntity visitante set " +
            " visitante.nome = :nome," +
            " visitante.telefone = :telefone " +
            " where visitante.id = :id")
    VisitanteEntity update(@Param("nome") String nome,
                       @Param("telefone") String telefone,
                       @Param("id") Long id);

    VisitanteEntity update(Long id, String nome, String telefone);
}
