package com.br.fullstackeducationM1S09.M1S09.Service;

import com.br.fullstackeducationM1S09.M1S09.Entity.VisitanteEntity;
import com.br.fullstackeducationM1S09.M1S09.Repository.EmprestimoRepository;
import com.br.fullstackeducationM1S09.M1S09.Repository.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class VisitanteService {

    private final VisitanteRepository visitanteRepository;

    public List<VisitanteEntity> listarVisitantes(){
        return visitanteRepository.findAll();
    }

    public VisitanteEntity salvarVisitante(VisitanteEntity visitante){
        return visitanteRepository.save(visitante);
    }

    public VisitanteEntity atualizarVisitante(VisitanteEntity visitanteEntity) {
        return visitanteRepository.update(
                visitanteEntity.getId(),
                visitanteEntity.getNome(),
                visitanteEntity.getTelefone()
        );
    }
    public void apagarVisitante(Long id) {
        visitanteRepository.deleteById(id);
    }

}
