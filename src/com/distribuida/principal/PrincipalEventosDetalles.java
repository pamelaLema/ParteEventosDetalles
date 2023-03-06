package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.EventosDetalles;
import com.distribuida.service.EventosDetallesService;

public class PrincipalEventosDetalles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		EventosDetallesService EventosDetallesService = context.getBean("eventosDetallesServiceImpl",EventosDetallesService.class);
		
		List<EventosDetalles> EventosDetalles = EventosDetallesService.findAll();

		EventosDetalles Evento = EventosDetallesService.findOne(1);
		
		
		
    //	EventosDetallesService.add("casaabierta",10,1,1);

	EventosDetallesService.up(1,"casaabiertaismac",9,1,1);
	//
	//  EventosDetallesService.del(1);	
	//	
//		EventosDetallesService.findAll("1");
	//	
		for(EventosDetalles item : EventosDetalles) {
			System.out.println(item);
		
		}
		
		System.out.println(EventosDetalles);
	}

}
