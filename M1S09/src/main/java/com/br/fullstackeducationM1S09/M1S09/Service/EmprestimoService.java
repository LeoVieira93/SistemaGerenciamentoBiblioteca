package com.br.fullstackeducationM1S09.M1S09.Service;

import com.br.fullstackeducationM1S09.M1S09.Entity.EmprestimoEntity;
import com.br.fullstackeducationM1S09.M1S09.Repository.EmprestimoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;

    public List<EmprestimoEntity> listarEmprestimos(){
        return emprestimoRepository.findAll();
    }

    public EmprestimoEntity salvarEmprestimo(EmprestimoEntity emprestimo){
        return emprestimoRepository.save(emprestimo);
    }

    public EmprestimoEntity atualizarEmprestimo(EmprestimoEntity emprestimoEntity) {
        return emprestimoRepository.update(
                emprestimoEntity.getId(),
                emprestimoEntity.getLivro(),
                emprestimoEntity.getMembro(),
                emprestimoEntity.getDataEmprestimo(),
                emprestimoEntity.getDataDevolucao()
        );
    }
    public void apagarEmprestimo(Long id) {
        emprestimoRepository.deleteById(id);
    }

}

