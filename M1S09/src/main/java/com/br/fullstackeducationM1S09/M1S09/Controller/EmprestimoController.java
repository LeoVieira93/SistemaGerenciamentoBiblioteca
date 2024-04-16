package com.br.fullstackeducationM1S09.M1S09.Controller;

import com.br.fullstackeducationM1S09.M1S09.Entity.EmprestimoEntity;
import com.br.fullstackeducationM1S09.M1S09.Repository.EmprestimoRepository;
import com.br.fullstackeducationM1S09.M1S09.Service.EmprestimoService;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
@NoArgsConstructor(force = true)
public class EmprestimoController {

    private final EmprestimoService emprestimoService;
    private final EmprestimoRepository emprestimoRepository;

    @GetMapping
    public List<EmprestimoEntity> getEmprestimos(){
        return emprestimoService.listarEmprestimos();
    }

    @PostMapping
    public EmprestimoEntity salvarEmprestimo(@RequestBody EmprestimoEntity emprestimoEntity){
        return emprestimoService.salvarEmprestimo(emprestimoEntity);
    }

    @PutMapping
    public EmprestimoEntity atualizaEmprestimo(EmprestimoEntity emprestimoEntity) {
        return emprestimoService.atualizarEmprestimo(emprestimoEntity);
    }

    @DeleteMapping
    public String apagarEmprestimo(@RequestParam ("id") Long id) {
        return "Emprestimo removido";
    }

}

