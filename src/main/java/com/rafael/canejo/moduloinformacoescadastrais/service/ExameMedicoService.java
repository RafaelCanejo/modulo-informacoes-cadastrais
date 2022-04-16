package com.rafael.canejo.moduloinformacoescadastrais.service;

import com.rafael.canejo.moduloinformacoescadastrais.dto.ExameDTO;

import java.util.List;

public interface ExameMedicoService {
  List<ExameDTO> listarExamesPorAssociado(String cpf);

  ExameDTO buscarExame(String codigoExame);
}
