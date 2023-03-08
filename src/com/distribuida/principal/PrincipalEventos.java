package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Ciudades;
import com.distribuida.entities.Eventos;
import com.distribuida.service.EventosService;

public class PrincipalEventos {
	public static void main (String[] args) {
		


	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	EventosService EventosService = context.getBean("eventosServiceImpl",EventosService.class);
	
	//List<Eventos> Eventos = EventosService.findAll();

   //Eventos Evento = EventosService.findOne(1);
	
	
	
	//EventosService.add("casasoftware1",new Date(),new Date(),"institutoismac","Tumbaco",null, "imagenn1",9.5,1 );

	//EventosService.up(2002,"casaabierpifo",new Date(),new Date(),"asunto","pifo",null,"imagen",2.5,2);
//
 // EventosService.del(2002);	
//	
	List<Eventos> evento =EventosService.findAll("1");
//	
	/*for(Eventos item : Eventos) {
		System.out.println(item);
	
	}*/
	
	System.out.println(evento);
	//context.close();
}
}