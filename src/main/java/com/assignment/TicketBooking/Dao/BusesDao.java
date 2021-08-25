package com.assignment.TicketBooking.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.assignment.TicketBooking.Entity.Buses;
import com.assignment.TicketBooking.Singleton.SingleTon;

public class BusesDao {
	
	public void saveBus(Buses bus) {
		
		SessionFactory factory = SingleTon.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(bus);
		transaction.commit();
	}
	
	public List<Buses> getBusList(String from,String destination) {
		
		SessionFactory factory = SingleTon.getSessionFactory();
		Session session = factory.openSession();
		String hqlquery="from Buses where busFrom=:f and busDestination=:d";
		Query query = session.createQuery(hqlquery);
		query.setParameter("f", from);
		query.setParameter("d", destination);
		return query.list();
		
	}
}
