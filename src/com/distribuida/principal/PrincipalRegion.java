package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Regiones;
import com.distribuida.service.RegionesService;

public class PrincipalRegion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		RegionesService RegionesService = context.getBean("regionesServiceImpl",RegionesService.class);
		
		List<Regiones> Regiones = RegionesService.findAll();

		//Regiones Evento = RegionesService.findOne(1);
		
		
		
		RegionesService.add("costa");

//		RegionesService.up(1,"sierra");
	//
	//  RegionesService.del(1);	
	//	
//		RegionesService.findAll("1");
	//	
		for(Regiones item : Regiones) {
			System.out.println(item);
		
		}
		
		//System.out.println(Regiones);
	}

}
