package com.rafael.canejo.moduloinformacoescadastrais.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.rafael.canejo.moduloinformacoescadastrais.model.Pessoa;
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
@SequenceGenerator(name = "associado_seq", sequenceName = "associado_seq", allocationSize = 1)
@Table(name = "Associado")
public class AssociadoEntity implements Serializable{

  private static final Long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "associado_seq")
  private Long id;

  @JsonIgnore
  @Builder.Default
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt = new Date();

  private String planoContratado;

  private String dataVigenciaPlano;

  private String tipoPlanoContratado;

  private String statusCadastro;

  private String nome;

  private String dataNascimento;

  private String cpf;

  private String rg;

  private String endereco;

  private String celular;
}
