package com.assignment.TicketBooking.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.assignment.TicketBooking.Entity.Tickets;
import com.assignment.TicketBooking.Singleton.SingleTon;

public class TicketsDao {
	
	public void bookTicket(Tickets ticket) {
		
		SessionFactory factory = SingleTon.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ticket);
		transaction.commit();
	}
	
	public void conformBookedTicket(int id) {
		SessionFactory factory = SingleTon.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlQuery="update Tickets set status='Conformed' where ticketId=:i";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("i", id);
		query.executeUpdate();
		transaction.commit();
	}
	
	public void cancleTicket(int id) {
		SessionFactory factory = SingleTon.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlQuery="delete from Tickets where ticketId=:i";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("i", id);
		query.executeUpdate();
		transaction.commit();
	}
	
}
