package com.rafael.canejo.moduloinformacoescadastrais.service.impl;

import com.rafael.canejo.moduloinformacoescadastrais.dto.PrestadorDTO;
import com.rafael.canejo.moduloinformacoescadastrais.repository.PrestadorRepository;
import com.rafael.canejo.moduloinformacoescadastrais.service.PrestadorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PrestadorServiceImpl implements PrestadorService {

  @Autowired
  private PrestadorRepository prestadorRepository;


  @Override
  public PrestadorDTO cadastrarPrestador(PrestadorDTO prestadorDTO) {
    return null;
  }

  @Override
  public PrestadorDTO atualizarPrestador(PrestadorDTO prestadorDTO) {
    return null;
  }

  @Override
  public void deletarPrestador(String registroProfissional) {

  }

  @Override
  public PrestadorDTO buscarPrestador(String registroProfissional) {
    return null;
  }
}
