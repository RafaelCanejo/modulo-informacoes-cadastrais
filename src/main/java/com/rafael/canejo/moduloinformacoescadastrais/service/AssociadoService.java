package com.rafael.canejo.moduloinformacoescadastrais.service;

import com.rafael.canejo.moduloinformacoescadastrais.dto.AssociadoDTO;

public interface AssociadoService {
  AssociadoDTO cadastrarAssociado(AssociadoDTO associadoDTO);

  AssociadoDTO atualizarAssociado(AssociadoDTO associadoDTO);

  void deletarAssociado(String cpf);

  AssociadoDTO buscarAssociado(String cpf);
}
