package com.rafael.canejo.moduloinformacoescadastrais.controller;

import com.rafael.canejo.moduloinformacoescadastrais.dto.AssociadoDTO;
import com.rafael.canejo.moduloinformacoescadastrais.service.AssociadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Slf4j
@RestController
@RequestMapping(value = "/associado", produces="application/json")
public class CadastroAssociadoController {

  @Autowired
  private AssociadoService associadoService;

  @RequestMapping(method = RequestMethod.GET, produces="application/json")
  public ResponseEntity<AssociadoDTO> buscarAssociado(@RequestParam(value = "cpf") String cpf) {
    AssociadoDTO associadoDTO = associadoService.buscarAssociado(cpf);
    return ResponseEntity.ok().body(associadoDTO);
  }

  @RequestMapping(method = RequestMethod.DELETE, path = "/cpf/{cpf}", produces="application/json")
  public ResponseEntity<Void> deletarAssociado(@PathVariable(value = "cpf") String cpf) {
    associadoService.deletarAssociado(cpf);
    return ResponseEntity.noContent().build();
  }

  @RequestMapping(method = RequestMethod.POST, produces="application/json")
  public ResponseEntity<AssociadoDTO> cadastrarAssociado(@RequestBody AssociadoDTO associadoDTO) {
    AssociadoDTO associadoCadastrado = associadoService.cadastrarAssociado(associadoDTO);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/cpf/{cpf}").buildAndExpand(associadoCadastrado.getCpf()).toUri();
    return ResponseEntity.created(uri).body(associadoCadastrado);
  }

  @RequestMapping(method = RequestMethod.PUT, produces="application/json")
  public ResponseEntity<AssociadoDTO> atualizarAssociado(@RequestBody AssociadoDTO associadoDTO) {
    AssociadoDTO associadoAtualizado = associadoService.atualizarAssociado(associadoDTO);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/cpf/{cpf}").buildAndExpand(associadoAtualizado.getCpf()).toUri();
    return ResponseEntity.created(uri).body(associadoAtualizado);
  }

}
