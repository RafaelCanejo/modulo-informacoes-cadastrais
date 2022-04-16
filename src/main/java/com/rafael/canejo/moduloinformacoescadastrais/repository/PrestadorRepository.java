package com.rafael.canejo.moduloinformacoescadastrais.repository;

import com.rafael.canejo.moduloinformacoescadastrais.entity.PrestadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestadorRepository extends JpaRepository<PrestadorEntity, Long> {

    void deleteByRegistroProfissional(String registroProfissional);

    PrestadorEntity findByRegistroProfissional(String registroProfissional);
}
