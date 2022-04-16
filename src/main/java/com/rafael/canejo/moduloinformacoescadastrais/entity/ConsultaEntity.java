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
@SequenceGenerator(name = "consulta_seq", sequenceName = "consulta_seq", allocationSize = 1)
@Table(name = "Consulta")
public class ConsultaEntity implements Serializable{

  private static final Long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consulta_seq")
  private Long id;

}
