package com.br.fullstackeducationM1S09.M1S09.Controller;

import com.br.fullstackeducationM1S09.M1S09.Entity.BibliotecarioEntity;
import com.br.fullstackeducationM1S09.M1S09.Repository.BibliotecarioRepository;
import com.br.fullstackeducationM1S09.M1S09.Service.BibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecarios")
@RequiredArgsConstructor
public class BibliotecarioController {

    private final BibliotecarioService bibliotecarioService;
    private final BibliotecarioRepository libliotecarioRepository;

    @GetMapping
    public List<BibliotecarioEntity> getBibliotecarios(){
        return (List<BibliotecarioEntity>) bibliotecarioService;
    }

    @PostMapping
    public BibliotecarioEntity salvarBibliotecario(@RequestBody BibliotecarioEntity libliotecarioEntity){
        return bibliotecarioService.salvarBibliotecario(libliotecarioEntity);
    }

    @PutMapping
    public BibliotecarioEntity atualizaBibliotecario(BibliotecarioEntity libliotecarioEntity) {
        return bibliotecarioService.atualizarBibliotecario(libliotecarioEntity);
    }

    @DeleteMapping
    public String apagarBibliotecario(@RequestParam ("id") Long id) {
        return "Bibliotecario removido";
    }

}
