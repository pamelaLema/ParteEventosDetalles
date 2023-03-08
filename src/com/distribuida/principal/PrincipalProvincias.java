package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Provincias;
import com.distribuida.entities.Regiones;
import com.distribuida.service.ProvinciasService;
import com.distribuida.service.RegionesService;

public class PrincipalProvincias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ProvinciasService provinciasService = context.getBean("provinciasServiceImpl",ProvinciasService.class);
		RegionesService regionesService = context.getBean("regionesServiceImpl",RegionesService.class);

		
	//	List<Provincias> provincias = provinciasService.findAll();

	//	Provincias Provincias1 = ProvinciasService.findOne(1);
		//Regiones regiones1 = regionesService.findOne(1);

		
		
	
	  provinciasService.add("pichincha",2);

//		ProvinciasService.up(1,"pichincha",1);
	//
	//  ProvinciasService.del(1);	 
	//	
//		ProvinciasService.findAll("1");
	//	3
	/*	for(Provincias item : provincias) {
			System.out.println(item);
		
		}*/
		
		//System.out.println(Provincias1);
	}

}
