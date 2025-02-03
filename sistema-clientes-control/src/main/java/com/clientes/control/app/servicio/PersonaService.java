package com.clientes.control.app.servicio;

import com.clientes.control.app.domain.Persona;

import java.util.List;

public interface PersonaService {
    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);
}
