package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Ciudades;
import com.distribuida.service.CiudadesService;

public class PrincipalCiudades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CiudadesService CiudadesService = context.getBean("ciudadesServiceImpl",CiudadesService.class);
		
		//List<Ciudades> Ciudades = CiudadesService.findAll();

		//Ciudades Evento = CiudadesService.findOne(1);
		
		
		
		//CiudadesService.add("quito",2);

		//CiudadesService.up(2002,"Pifo");
	//
	// CiudadesService.del(2002);	
	//	
		 List<Ciudades> ciudades1 =	CiudadesService.findAll("1");
	//	
		/*for(Ciudades item : Ciudades) {
			System.out.println(item);
		
		}*/
	
		System.out.println(ciudades1);
	}

	}


