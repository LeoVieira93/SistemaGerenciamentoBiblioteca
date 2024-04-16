package com.br.fullstackeducationM1S09.M1S09.Service;

import com.br.fullstackeducationM1S09.M1S09.Entity.LivroEntity;
import com.br.fullstackeducationM1S09.M1S09.Repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository livroRepository;

    public List<LivroEntity> listarLivros(){
        return livroRepository.findAll();
    }

    public LivroEntity salvarLivro(LivroEntity livro){
        return livroRepository.save(livro);
    }

    public LivroEntity atualizarLivro(LivroEntity livroEntity) {
        return livroRepository.update(
                livroEntity.getId(),
                livroEntity.getTitulo(),
                livroEntity.getAnoPub()
        );
    }
    public void apagarLivro(Long id) {
        livroRepository.deleteById(id);
    }

}
