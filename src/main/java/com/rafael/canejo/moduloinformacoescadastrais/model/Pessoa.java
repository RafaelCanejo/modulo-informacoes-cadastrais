package com.rafael.canejo.moduloinformacoescadastrais.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String rg;
    private String endereco;
    private String celular;
}
