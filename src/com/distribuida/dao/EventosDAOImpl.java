package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Eventos;



@Repository
public class EventosDAOImpl implements EventosDAO {


	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<Eventos> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		return session.createQuery("from Eventos", Eventos.class).getResultList();
	}

	@Override
	@Transactional
	public Eventos findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Eventos.class, id);
	}

	@Override
	@Transactional
	public void add(Eventos evento) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(evento);
	}

	@Override
	@Transactional
	public void up(Eventos evento) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(evento);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

	@Override
	@Transactional
	public List<Eventos>findAll(String busqueda) {
		
		Session session=sessionFactory.getCurrentSession();

		   Query<Eventos> query= session.createQuery(
	       		
	       		"select ev "
	       		+ " from Eventos ev "
	       		+ " where ev.nombre LIKE: Busqueda "
	       		+" or ev.fecha_inicio LIKE: Busqueda "
	       		+" or ev.fecha_fin LIKE: Busqueda "
	       		+" or ev.asunto LIKE: Busqueda "
	       		+" or ev.lugar LIKE: Busqueda "
	       		+" or ev.imagen LIKE: Busqueda "
	       		+" or ev.imagen_nombre LIKE: Busqueda "
	       		+" or ev.promedio_calificacion LIKE: Busqueda "
 		

	    		,Eventos.class);
	       query.setParameter("Busqueda","%"+busqueda+"%");
			return query.getResultList();
	}

}
