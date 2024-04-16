package com.br.fullstackeducationM1S09.M1S09.Service;

import com.br.fullstackeducationM1S09.M1S09.Entity.BibliotecarioEntity;
import com.br.fullstackeducationM1S09.M1S09.Repository.BibliotecarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public List<BibliotecarioEntity> listarBibliotecarios(){
        return bibliotecarioRepository.findAll();
    }

    public BibliotecarioEntity salvarBibliotecario(BibliotecarioEntity bibliotecario){
        return bibliotecarioRepository.save(bibliotecario);
    }

    public BibliotecarioEntity atualizarBibliotecario(BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioRepository.update(
                bibliotecarioEntity.getId(),
                bibliotecarioEntity.getNome(),
                bibliotecarioEntity.getEmail()
        );
    }
    public void apagarBibliotecario(Long id) {
        bibliotecarioRepository.deleteById(id);
    }

}

