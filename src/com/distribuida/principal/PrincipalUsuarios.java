package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Usuario;
import com.distribuida.service.UsuarioService;

public class PrincipalUsuarios {
	public static void main (String[] args) {
		


	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	UsuarioService UsuarioService = context.getBean("usuarioServiceImpl",UsuarioService.class);
	
	List<Usuario> Usuarios = UsuarioService.findAll();

	Usuario usuario = UsuarioService.findOne(1);
	
	
//	UsuarioService.add(178468954, "Carlos","Juan", "Caiza","Caiza", new Date(),17,1, "Av. por ahi y mas aca", 987654321, "Ccaiza@correo.com","usuario");

//	UsuarioService.up(2,17134566, "Jhon","Marco", "Taipe","Taipe", new Date(),20,1, "Av. por ahi y mas allásito", 123456789, "jtaipe@correo.com","admin");

// UsuarioService.del(1);	
	

	
	for(Usuario item : Usuarios) {
		System.out.println(item);
	
	}
	

}
}