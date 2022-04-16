package com.rafael.canejo.moduloinformacoescadastrais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuloInformacoesCadastraisApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "modulo-informacoes-cadastrais-config");
		SpringApplication.run(ModuloInformacoesCadastraisApplication.class, args);
	}

}
