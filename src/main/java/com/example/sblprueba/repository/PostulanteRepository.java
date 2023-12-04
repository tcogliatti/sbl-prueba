package com.example.sblprueba.repository;

import com.example.sblprueba.model.SblPostulantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostulanteRepository extends JpaRepository<SblPostulantesEntity, Long> {
}
