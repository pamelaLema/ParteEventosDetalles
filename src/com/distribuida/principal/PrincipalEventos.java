package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Eventos;
import com.distribuida.service.EventosService;

public class PrincipalEventos {
	public static void main (String[] args) {
		


	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	EventosService EventosService = context.getBean("eventosServiceImpl",EventosService.class);
	
	List<Eventos> Eventos = EventosService.findAll();

	//Eventos Evento = EventosService.findOne(1);
	
	
	
	EventosService.add("casaabiertaismac",new Date(),new Date(),"asunto","Tumbaco",null, "imagennombre",9.5 );

//	EventosService.up(1,"casaabierta",new Date(),"asunto","Tumbaco","imagen","imagen",2);
//
//  EventosService.del(1);	
//	
//	EventosService.findAll("1");
//	
	for(Eventos item : Eventos) {
		System.out.println(item);
	
	}
	
	//System.out.println(Eventos);
	//context.close();
}
}