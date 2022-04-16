package com.rafael.canejo.moduloinformacoescadastrais.service;

import com.rafael.canejo.moduloinformacoescadastrais.dto.ConsultaDTO;

import java.util.List;

public interface ConsultaMedicaService {
  List<ConsultaDTO> listarConsultasPorAssociado(String cpf);

  ConsultaDTO buscarConsulta(String codigoConsulta);
}
