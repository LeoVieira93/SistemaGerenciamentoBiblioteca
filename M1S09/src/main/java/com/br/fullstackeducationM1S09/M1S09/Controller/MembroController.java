package com.br.fullstackeducationM1S09.M1S09.Controller;

import com.br.fullstackeducationM1S09.M1S09.Entity.MembroEntity;
import com.br.fullstackeducationM1S09.M1S09.Repository.MembroRepository;
import com.br.fullstackeducationM1S09.M1S09.Repository.MembroRepository;
import com.br.fullstackeducationM1S09.M1S09.Service.MembroService;
import com.br.fullstackeducationM1S09.M1S09.Service.MembroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membros")
@RequiredArgsConstructor
public class MembroController {

    private final MembroService membroService;
    private final MembroRepository membroRepository;

    @GetMapping
    public List<MembroEntity> getMembros(){
        return membroService.listarMembros();
    }

    @PostMapping
    public MembroEntity salvarMembro(@RequestBody MembroEntity membroEntity){
        return membroService.salvarMembro(membroEntity);
    }

    @PutMapping
    public MembroEntity atualizaMembro(MembroEntity membroEntity) {
        return membroService.atualizarMembro(membroEntity);
    }

    @DeleteMapping
    public String apagarMembro(@RequestParam ("id") Long id) {
        return "Membro removido";
    }

}


