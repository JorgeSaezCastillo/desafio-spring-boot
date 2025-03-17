package com.nuevo.spa.taskmanagement.repository;

import com.nuevo.spa.taskmanagement.model.EstadoTarea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstadoTareaRepository extends JpaRepository<EstadoTarea, Long> {
    Optional<EstadoTarea> findByNombre(String nombre);
}