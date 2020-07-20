package com.palpa.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.palpa.demo.interfaces.IUsuario;
import com.palpa.demo.model.Usuario;

@SpringBootTest
class PalpaContinua3ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
    private IUsuario repo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Test
    public void crearUsuarioTest() {
        Usuario us= new Usuario();
        us.setId(2);
        us.setNombre("docente");
        us.setClave(encoder.encode("d18135"));
        Usuario retorno = repo.save(us);

        assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
    }

}
