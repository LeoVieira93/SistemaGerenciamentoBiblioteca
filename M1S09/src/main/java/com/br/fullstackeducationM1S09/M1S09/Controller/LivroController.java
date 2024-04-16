package com.br.fullstackeducationM1S09.M1S09.Controller;

import com.br.fullstackeducationM1S09.M1S09.Entity.LivroEntity;
import com.br.fullstackeducationM1S09.M1S09.Repository.LivroRepository;
import com.br.fullstackeducationM1S09.M1S09.Service.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor
public class LivroController {

    private final LivroService livroService;
    private final LivroRepository livroRepository;

    @GetMapping
    public List<LivroEntity> getLivros(){
        return livroService.listarLivros();
    }

    @PostMapping
    public LivroEntity salvarLivro(@RequestBody LivroEntity livroEntity){
        return livroService.salvarLivro(livroEntity);
    }

    @PutMapping
    public LivroEntity atualizaLivro(LivroEntity livroEntity) {
        return livroService.atualizarLivro(livroEntity);
    }

    @DeleteMapping
    public String apagarLivro(@RequestParam ("id") Long id) {
        return "Livro removido";
    }

}
