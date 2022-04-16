package com.rafael.canejo.moduloinformacoescadastrais.service.impl;

import com.rafael.canejo.moduloinformacoescadastrais.dto.ConsultaDTO;
import com.rafael.canejo.moduloinformacoescadastrais.service.ConsultaMedicaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ConsultaMedicaServiceImpl implements ConsultaMedicaService {


  @Override
  public List<ConsultaDTO> listarConsultasPorAssociado(String cpf) {
    return null;
  }

  @Override
  public ConsultaDTO buscarConsulta(String codigoConsulta) {
    return null;
  }
}
