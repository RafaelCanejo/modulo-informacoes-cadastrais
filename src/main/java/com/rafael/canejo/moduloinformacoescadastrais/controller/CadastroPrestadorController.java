package com.rafael.canejo.moduloinformacoescadastrais.controller;

import com.rafael.canejo.moduloinformacoescadastrais.dto.PrestadorDTO;
import com.rafael.canejo.moduloinformacoescadastrais.service.PrestadorService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Slf4j
@RestController
@RequestMapping(value = "/prestador", produces="application/json")
public class CadastroPrestadorController {

  @Autowired
  private PrestadorService prestadorService;

  @ApiOperation(value = "Realiza uma busca de prestador por seu registro profissional")
  @RequestMapping(method = RequestMethod.GET, produces="application/json")
  public ResponseEntity<PrestadorDTO> buscarPrestador(@RequestParam(value = "registro-profissional") String registroProfissional) {
    PrestadorDTO prestadorDTO = prestadorService.buscarPrestador(registroProfissional);
    return ResponseEntity.ok().body(prestadorDTO);
  }

  @ApiOperation(value = "Realiza uma exclusão de prestador por seu registro profissional")
  @RequestMapping(method = RequestMethod.DELETE, path = "/{registroProfissional}", produces="application/json")
  public ResponseEntity<Void> deletarPrestador(@PathVariable(value = "registroProfissional") String registroProfissional) {
    prestadorService.deletarPrestador(registroProfissional);
    return ResponseEntity.noContent().build();
  }

  @ApiOperation(value = "Realiza a inclusão de um novo prestador")
  @RequestMapping(method = RequestMethod.POST, produces="application/json")
  public ResponseEntity<PrestadorDTO> cadastrarPrestador(@RequestBody PrestadorDTO prestadorDTO) {
    PrestadorDTO prestadorCadastrado = prestadorService.cadastrarPrestador(prestadorDTO);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{registroProfissional}").buildAndExpand(prestadorCadastrado.getRegistroProfissional()).toUri();
    return ResponseEntity.created(uri).body(prestadorCadastrado);
  }

  @ApiOperation(value = "Realiza a atualização de um prestador")
  @RequestMapping(method = RequestMethod.PUT, produces="application/json")
  public ResponseEntity<PrestadorDTO> atualizarPrestador(@RequestBody PrestadorDTO prestadorDTO) {
    PrestadorDTO prestadorAtualizado = prestadorService.atualizarPrestador(prestadorDTO);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{registroProfissional}").buildAndExpand(prestadorAtualizado.getRegistroProfissional()).toUri();
    return ResponseEntity.created(uri).body(prestadorAtualizado);
  }

}
