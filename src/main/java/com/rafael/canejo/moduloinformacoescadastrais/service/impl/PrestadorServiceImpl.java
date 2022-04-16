package com.rafael.canejo.moduloinformacoescadastrais.service.impl;

import com.rafael.canejo.moduloinformacoescadastrais.dto.PrestadorDTO;
import com.rafael.canejo.moduloinformacoescadastrais.entity.PrestadorEntity;
import com.rafael.canejo.moduloinformacoescadastrais.repository.PrestadorRepository;
import com.rafael.canejo.moduloinformacoescadastrais.service.ConsultaMedicaService;
import com.rafael.canejo.moduloinformacoescadastrais.service.ExameMedicoService;
import com.rafael.canejo.moduloinformacoescadastrais.service.PrestadorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PrestadorServiceImpl implements PrestadorService {

  @Autowired
  private PrestadorRepository prestadorRepository;

  @Autowired
  private ExameMedicoService exameMedicoService;

  @Autowired
  private ConsultaMedicaService consultaMedicaService;

  @Override
  public PrestadorDTO cadastrarPrestador(PrestadorDTO prestadorDTO) {
    PrestadorEntity prestadorEntity = prestadorDTO.converterDTOParaEntity(prestadorDTO);
    PrestadorDTO prestador = prestadorDTO.converterEntityParaDTO(prestadorRepository.save(prestadorEntity));
    log.info("[SUCESSO][Prestador cadastrado com sucesso: {}]", prestador.getRegistroProfissional());
    return prestador;
  }

  @Override
  public PrestadorDTO atualizarPrestador(PrestadorDTO prestadorDTO) {
    PrestadorEntity prestadorEntity = prestadorRepository.findByRegistroProfissional(prestadorDTO.getRegistroProfissional());
    prestadorEntity = prestadorDTO.atualizarPrestador(prestadorDTO, prestadorEntity);
    PrestadorDTO prestador = prestadorDTO.converterEntityParaDTO(prestadorRepository.save(prestadorEntity));
    log.info("[SUCESSO][Prestador atualizado com sucesso: {}]", prestador.getRegistroProfissional());
    return prestador;
  }

  @Override
  public void deletarPrestador(String registroProfissional) {
    PrestadorEntity prestadorEntity = prestadorRepository.findByRegistroProfissional(registroProfissional);
    prestadorRepository.delete(prestadorEntity);
    log.info("[SUCESSO][Prestador excluído com sucesso: {}]", registroProfissional);
  }

  @Override
  public PrestadorDTO buscarPrestador(String registroProfissional) {
    PrestadorEntity prestadorEntity = prestadorRepository.findByRegistroProfissional(registroProfissional);
    PrestadorDTO prestador = new PrestadorDTO().converterEntityParaDTO(prestadorEntity);
    log.info("[SUCESSO][Prestador encontrado com sucesso: {}]", prestador.getRegistroProfissional());
    return prestador;
  }

}
