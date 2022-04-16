package com.rafael.canejo.moduloinformacoescadastrais.service.impl;

import com.rafael.canejo.moduloinformacoescadastrais.dto.AssociadoDTO;
import com.rafael.canejo.moduloinformacoescadastrais.entity.AssociadoEntity;
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
    AssociadoEntity associadoEntity = associadoDTO.converterDTOParaEntity(associadoDTO);
    AssociadoDTO associado = associadoDTO.converterEntityParaDTO(associadoRepository.save(associadoEntity));
    log.info("[SUCESSO][Associado cadastrado com sucesso: {}]", associadoDTO.getCpf());
    return associado;
  }

  @Override
  public AssociadoDTO atualizarAssociado(AssociadoDTO associadoDTO) {
    AssociadoEntity associadoEntity = associadoRepository.findByCpf(associadoDTO.getCpf());
    associadoEntity = associadoDTO.atualizarAssociado(associadoDTO, associadoEntity);
    AssociadoDTO associado = associadoDTO.converterEntityParaDTO(associadoRepository.save(associadoEntity));
    log.info("[SUCESSO][Associado atualizado com sucesso: {}]", associadoDTO.getCpf());
    return associado;
  }

  @Override
  public void deletarAssociado(String cpf) {
    AssociadoEntity associadoEntity = associadoRepository.findByCpf(cpf);
    associadoRepository.delete(associadoEntity);
    log.info("[SUCESSO][Associado excluído com sucesso: {}]", cpf);
  }

  @Override
  public AssociadoDTO buscarAssociado(String cpf) {
    AssociadoEntity associadoEntity = associadoRepository.findByCpf(cpf);
    AssociadoDTO associadoDTO = new AssociadoDTO().converterEntityParaDTO(associadoEntity);
    log.info("[SUCESSO][Associado encontrado com sucesso: {}]", associadoDTO.getCpf());
    return associadoDTO;
  }

}
