package com.rafael.canejo.moduloinformacoescadastrais.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.rafael.canejo.moduloinformacoescadastrais.entity.AssociadoEntity;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
@ToString
@Getter
@Setter
public class AssociadoDTO implements Serializable{
  private static final Long serialVersionUID = 1L;

  @JsonIgnore
  private Long id;

  @JsonIgnore
  private Date createdAt;

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


  public AssociadoDTO converterEntityParaDTO(AssociadoEntity associadoEntity) {
    return AssociadoDTO.builder()
            .celular(associadoEntity.getCelular())
            .cpf(associadoEntity.getCelular())
            .createdAt(associadoEntity.getCreatedAt())
            .dataNascimento(associadoEntity.getDataNascimento())
            .dataVigenciaPlano(associadoEntity.getDataVigenciaPlano())
            .endereco(associadoEntity.getEndereco())
            .id(associadoEntity.getId())
            .nome(associadoEntity.getNome())
            .planoContratado(associadoEntity.getPlanoContratado())
            .rg(associadoEntity.getRg())
            .statusCadastro(associadoEntity.getStatusCadastro())
            .tipoPlanoContratado(associadoEntity.getTipoPlanoContratado())
            .build();
  }

  public AssociadoEntity converterDTOParaEntity(AssociadoDTO associadoDTO) {
    return AssociadoEntity.builder()
            .celular(associadoDTO.getCelular())
            .cpf(associadoDTO.getCpf())
            .dataNascimento(associadoDTO.getDataNascimento())
            .dataVigenciaPlano(associadoDTO.getDataVigenciaPlano())
            .endereco(associadoDTO.getEndereco())
            .id(associadoDTO.getId())
            .nome(associadoDTO.getNome())
            .planoContratado(associadoDTO.getPlanoContratado())
            .rg(associadoDTO.getRg())
            .statusCadastro(associadoDTO.getStatusCadastro())
            .tipoPlanoContratado(associadoDTO.getTipoPlanoContratado())
            .build();
  }

  public AssociadoEntity atualizarAssociado(AssociadoDTO associadoDTO, AssociadoEntity associadoEntity) {
    associadoEntity.setCelular(associadoDTO.getCelular());
    associadoEntity.setCpf(associadoDTO.getCpf());
    associadoEntity.setDataNascimento(associadoDTO.getDataNascimento());
    associadoEntity.setDataVigenciaPlano(associadoDTO.getDataVigenciaPlano());
    associadoEntity.setEndereco(associadoDTO.getEndereco());
    associadoEntity.setNome(associadoDTO.getNome());
    associadoEntity.setPlanoContratado(associadoDTO.getPlanoContratado());
    associadoEntity.setRg(associadoDTO.getRg());
    associadoEntity.setStatusCadastro(associadoDTO.getStatusCadastro());
    associadoEntity.setTipoPlanoContratado(associadoDTO.getTipoPlanoContratado());
    return associadoEntity;
  }
}
