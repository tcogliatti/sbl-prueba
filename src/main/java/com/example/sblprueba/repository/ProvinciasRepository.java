package com.example.sblprueba.repository;

import com.example.sblprueba.model.ProvinciasEntity;
import com.example.sblprueba.model.SblPostulantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinciasRepository extends JpaRepository<ProvinciasEntity, Long> {
}
