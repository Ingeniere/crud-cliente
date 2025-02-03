package com.clientes.control.app;

import com.clientes.control.app.domain.Rol;
import com.clientes.control.app.domain.Usuario;
import com.clientes.control.app.servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SistemaClientesControlApplication{


	public static void main(String[] args) {
		SpringApplication.run(SistemaClientesControlApplication.class, args);
	}


}
