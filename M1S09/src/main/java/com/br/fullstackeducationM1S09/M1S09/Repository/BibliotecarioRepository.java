package com.br.fullstackeducationM1S09.M1S09.Repository;

import com.br.fullstackeducationM1S09.M1S09.Entity.BibliotecarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {
}
