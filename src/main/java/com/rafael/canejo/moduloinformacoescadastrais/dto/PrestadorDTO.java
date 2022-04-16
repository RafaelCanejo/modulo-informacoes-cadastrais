package com.rafael.canejo.moduloinformacoescadastrais.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.rafael.canejo.moduloinformacoescadastrais.entity.AssociadoEntity;
import com.rafael.canejo.moduloinformacoescadastrais.entity.PrestadorEntity;
import lombok.*;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
@ToString
@Getter
@Setter
public class PrestadorDTO implements Serializable {

  private static final Long serialVersionUID = 1L;

  @JsonIgnore
  private Long id;

  @JsonIgnore
  private Date createdAt;

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

  public PrestadorDTO converterEntityParaDTO(PrestadorEntity prestadorEntity) {
    return PrestadorDTO.builder()
                          .celular(prestadorEntity.getCelular())
                          .cpf(prestadorEntity.getCpf())
                          .createdAt(prestadorEntity.getCreatedAt())
                          .dataInicioPrestacaoServico(prestadorEntity.getDataInicioPrestacaoServico())
                          .dataNascimento(prestadorEntity.getDataNascimento())
                          .empresa(prestadorEntity.getEmpresa())
                          .endereco(prestadorEntity.getEndereco())
                          .especialidade(prestadorEntity.getEspecialidade())
                          .formacao(prestadorEntity.getFormacao())
                          .id(prestadorEntity.getId())
                          .nome(prestadorEntity.getNome())
                          .registroProfissional(prestadorEntity.getRegistroProfissional())
                          .rg(prestadorEntity.getRg())
                        .build();
  }

  public PrestadorEntity converterDTOParaEntity(PrestadorDTO prestadorDTO) {
    return PrestadorEntity.builder()
                            .celular(prestadorDTO.getCelular())
                            .cpf(prestadorDTO.getCpf())
                            .dataInicioPrestacaoServico(prestadorDTO.getDataInicioPrestacaoServico())
                            .dataNascimento(prestadorDTO.getDataNascimento())
                            .empresa(prestadorDTO.getEmpresa())
                            .endereco(prestadorDTO.getEndereco())
                            .especialidade(prestadorDTO.getEspecialidade())
                            .formacao(prestadorDTO.getFormacao())
                            .id(prestadorDTO.getId())
                            .nome(prestadorDTO.getNome())
                            .registroProfissional(prestadorDTO.getRegistroProfissional())
                            .rg(prestadorDTO.getRg())
                          .build();
  }

  public PrestadorEntity atualizarPrestador(PrestadorDTO prestadorDTO, PrestadorEntity prestadorEntity) {
    prestadorEntity.setCelular(prestadorDTO.getCelular());
    prestadorEntity.setCpf(prestadorDTO.getCpf());
    prestadorEntity.setDataInicioPrestacaoServico(prestadorDTO.getDataInicioPrestacaoServico());
    prestadorEntity.setDataNascimento(prestadorDTO.getDataNascimento());
    prestadorEntity.setEmpresa(prestadorDTO.getEmpresa());
    prestadorEntity.setEndereco(prestadorDTO.getEndereco());
    prestadorEntity.setEspecialidade(prestadorDTO.getEspecialidade());
    prestadorEntity.setFormacao(prestadorDTO.getFormacao());
    prestadorEntity.setNome(prestadorDTO.getNome());
    prestadorEntity.setRegistroProfissional(prestadorDTO.getRegistroProfissional());
    prestadorEntity.setRg(prestadorDTO.getRg());
    return prestadorEntity;
  }
}
