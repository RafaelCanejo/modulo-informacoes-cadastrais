package com.rafael.canejo.moduloinformacoescadastrais.service.impl;

import com.rafael.canejo.moduloinformacoescadastrais.dto.AssociadoDTO;
import com.rafael.canejo.moduloinformacoescadastrais.repository.AssociadoRepository;
import com.rafael.canejo.moduloinformacoescadastrais.service.AssociadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AssociadoServiceImpl implements AssociadoService {

  @Autowired
  private AssociadoRepository associadoRepository;


  @Override
  public AssociadoDTO cadastrarAssociado(AssociadoDTO associadoDTO) {
    return null;
  }

  @Override
  public AssociadoDTO atualizarAssociado(AssociadoDTO associadoDTO) {
    return null;
  }

  @Override
  public void deletarAssociado(String cpf) {

  }

  @Override
  public AssociadoDTO buscarAssociado(String cpf) {
    return null;
  }
}
