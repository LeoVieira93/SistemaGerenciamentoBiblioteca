package com.br.fullstackeducationM1S09.M1S09.Service;

import com.br.fullstackeducationM1S09.M1S09.Entity.MembroEntity;
import com.br.fullstackeducationM1S09.M1S09.Entity.MembroEntity;
import com.br.fullstackeducationM1S09.M1S09.Repository.EmprestimoRepository;
import com.br.fullstackeducationM1S09.M1S09.Repository.MembroRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class MembroService {

    private final MembroRepository membroRepository;

    public List<MembroEntity> listarMembros(){
        return membroRepository.findAll();
    }

    public MembroEntity salvarMembro(MembroEntity membro){
        return membroRepository.save(membro);
    }

    public MembroEntity atualizarMembro(MembroEntity membroEntity) {
        return membroRepository.update(
                membroEntity.getId(),
                membroEntity.getNome(),
                membroEntity.getTelefone(),
                membroEntity.getEndereco()
        );
    }
    public void apagarMembro(Long id) {
        membroRepository.deleteById(id);
    }

}

