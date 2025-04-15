package com.exemplo.universidade.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {
    private String nome;
    private String cpf;
    private int idade;
}