package com.rafael.canejo.moduloinformacoescadastrais.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
@ToString
@Getter
@Setter
@SequenceGenerator(name = "exame_seq", sequenceName = "exame_seq", allocationSize = 1)
@Table(name = "Exame")
public class ExameEntity implements Serializable{
  private static final Long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exame_seq")
  private Long id;

  private String tipoPlano;

  @Temporal(TemporalType.TIMESTAMP)
  private Date dataAgendamento;

  @OneToOne
  @JoinColumn(name = "associado_id", referencedColumnName = "id")
  private AssociadoEntity associado;

  private String exameRealizado;
}
