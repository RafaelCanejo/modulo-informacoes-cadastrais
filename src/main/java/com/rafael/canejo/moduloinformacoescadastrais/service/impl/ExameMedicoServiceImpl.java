package com.rafael.canejo.moduloinformacoescadastrais.service.impl;

import com.rafael.canejo.moduloinformacoescadastrais.dto.ExameDTO;
import com.rafael.canejo.moduloinformacoescadastrais.service.ExameMedicoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ExameMedicoServiceImpl implements ExameMedicoService {


  @Override
  public List<ExameDTO> listarExamesPorAssociado(String cpf) {
    return null;
  }

  @Override
  public ExameDTO buscarExame(String codigoExame) {
    return null;
  }
}
