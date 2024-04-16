package com.br.fullstackeducationM1S09.M1S09.Service;

import com.br.fullstackeducationM1S09.M1S09.Repository.EmprestimoRepository;
import com.br.fullstackeducationM1S09.M1S09.Repository.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class VisitanteService {

    private final VisitanteRepository visitanteRepository;

}
