package com.br.fullstackeducationM1S09.M1S09.Repository;

import com.br.fullstackeducationM1S09.M1S09.Entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

    @Query("update MembroEntity membro set " +
            "membro.nome = :titulo," +
            "membro.telefone = :autor," +
            "membro.endereco = :anoPub " +
            "where membro.id = :id")
    MembroEntity update(Long id, @Param("nome") String nome,
                        @Param("telefone") String telefone,
                        @Param("endereco") String endereco);
}
