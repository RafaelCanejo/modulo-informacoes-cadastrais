package com.rafael.canejo.moduloinformacoescadastrais.controller;

import com.rafael.canejo.moduloinformacoescadastrais.dto.AssociadoDTO;
import com.rafael.canejo.moduloinformacoescadastrais.service.AssociadoService;
import io.swagger.annotations.ApiOperation;
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

  @ApiOperation(value = "Realiza uma busca de associado por seu cpf")
  @RequestMapping(method = RequestMethod.GET, produces="application/json")
  public ResponseEntity<AssociadoDTO> buscarAssociado(@RequestParam(value = "cpf") String cpf) {
    AssociadoDTO associadoDTO = associadoService.buscarAssociado(cpf);
    return ResponseEntity.ok().body(associadoDTO);
  }

  @ApiOperation(value = "Realiza uma exclusão de associado por seu cpf")
  @RequestMapping(method = RequestMethod.DELETE, path = "/{cpf}", produces="application/json")
  public ResponseEntity<Void> deletarAssociado(@PathVariable(value = "cpf") String cpf) {
    associadoService.deletarAssociado(cpf);
    return ResponseEntity.noContent().build();
  }

  @ApiOperation(value = "Realiza uma inclusão de um novo associado")
  @RequestMapping(method = RequestMethod.POST, produces="application/json")
  public ResponseEntity<AssociadoDTO> cadastrarAssociado(@RequestBody AssociadoDTO associadoDTO) {
    AssociadoDTO associadoCadastrado = associadoService.cadastrarAssociado(associadoDTO);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{cpf}").buildAndExpand(associadoCadastrado.getCpf()).toUri();
    return ResponseEntity.created(uri).body(associadoCadastrado);
  }

  @ApiOperation(value = "Realiza a atualização de um associado")
  @RequestMapping(method = RequestMethod.PUT, produces="application/json")
  public ResponseEntity<AssociadoDTO> atualizarAssociado(@RequestBody AssociadoDTO associadoDTO) {
    AssociadoDTO associadoAtualizado = associadoService.atualizarAssociado(associadoDTO);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{cpf}").buildAndExpand(associadoAtualizado.getCpf()).toUri();
    return ResponseEntity.created(uri).body(associadoAtualizado);
  }

}
