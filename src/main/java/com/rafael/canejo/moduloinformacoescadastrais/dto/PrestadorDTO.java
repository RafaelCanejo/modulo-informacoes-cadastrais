package com.rafael.canejo.moduloinformacoescadastrais.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
@ToString
@Getter
@Setter
public class PrestadorDTO implements Serializable {

  private static final Long serialVersionUID = 1L;

  private Long id;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt = new Date();

  private String empresa;

  private String formacao;

  private String especialidade;

  private String dataInicioPrestacaoServico;

  private String registroProfissional;

  private String nome;

  private String dataNascimento;

  private String cpf;

  private String rg;

  private String endereco;

  private String celular;

}
