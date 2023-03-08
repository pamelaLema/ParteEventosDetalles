package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Eventos;
import com.distribuida.entities.Regiones;
import com.distribuida.service.RegionesService;

public class PrincipalRegion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		RegionesService RegionesService = context.getBean("regionesServiceImpl",RegionesService.class);
		
	//	List<Regiones> Regiones = RegionesService.findAll();

		//Regiones Evento = RegionesService.findOne(1);
		
		
		
	//	RegionesService.add("oriente");

	//RegionesService.up(2,"costa");
	//
	 // RegionesService.del(1004);	
		List<Regiones> region =RegionesService.findAll("costa");
	//	
		for(Regiones item : region) {
			System.out.println(item);
		
		}
		
		System.out.println(region);
	}

}
