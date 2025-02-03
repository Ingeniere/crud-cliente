package com.clientes.control.app.dao;

import com.clientes.control.app.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Long> {
}
