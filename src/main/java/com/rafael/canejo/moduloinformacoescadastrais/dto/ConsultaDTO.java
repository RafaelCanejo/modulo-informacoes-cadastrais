package com.rafael.canejo.moduloinformacoescadastrais.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
@ToString
@Getter
@Setter
public class ConsultaDTO implements Serializable{

  private static final Long serialVersionUID = 1L;

  private Long id;

}
