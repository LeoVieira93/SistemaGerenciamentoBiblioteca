package com.br.fullstackeducationM1S09.M1S09.Request;

import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
public class LivroRequest {

    private String titulo;
    private String autor;
    private LocalDate anoPub;

}
