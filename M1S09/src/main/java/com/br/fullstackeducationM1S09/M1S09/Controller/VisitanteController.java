package com.br.fullstackeducationM1S09.M1S09.Controller;

import com.br.fullstackeducationM1S09.M1S09.Entity.VisitanteEntity;
import com.br.fullstackeducationM1S09.M1S09.Repository.VisitanteRepository;
import com.br.fullstackeducationM1S09.M1S09.Service.VisitanteService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitante")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteService visitanteService;
    private final VisitanteRepository visitanteRepository;

    @GetMapping
    public List<VisitanteEntity> getVisitantes(){
        return visitanteService.listarVisitantes();
    }

    @PostMapping
    public VisitanteEntity salvarVisitante(@RequestBody VisitanteEntity visitanteEntity){
        return visitanteService.salvarVisitante(visitanteEntity);
    }

    @PutMapping
    public VisitanteEntity atualizaVisitante(VisitanteEntity visitanteEntity) {
        return visitanteService.atualizarVisitante(visitanteEntity);
    }

    @DeleteMapping
    public String apagarVisitante(@RequestParam ("id") Long id) {
        return "Visitante removido";
    }

}
