package com.rafael.canejo.moduloinformacoescadastrais.repository;

import com.rafael.canejo.moduloinformacoescadastrais.entity.AssociadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociadoRepository extends JpaRepository<AssociadoEntity, Long> {

}
