package com.rafael.canejo.moduloinformacoescadastrais.dto;

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

  private Long id;

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
            .cpf(associadoDTO.getCelular())
            .createdAt(associadoDTO.getCreatedAt())
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
}
