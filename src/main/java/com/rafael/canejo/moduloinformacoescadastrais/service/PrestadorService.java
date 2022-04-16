package com.rafael.canejo.moduloinformacoescadastrais.service;

import com.rafael.canejo.moduloinformacoescadastrais.dto.PrestadorDTO;

public interface PrestadorService {
  PrestadorDTO cadastrarPrestador(PrestadorDTO prestadorDTO);

  PrestadorDTO atualizarPrestador(PrestadorDTO prestadorDTO);

  void deletarPrestador(String registroProfissional);

  PrestadorDTO buscarPrestador(String registroProfissional);
}
