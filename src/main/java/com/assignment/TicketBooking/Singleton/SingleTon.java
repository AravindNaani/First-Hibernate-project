package com.assignment.TicketBooking.Singleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.assignment.TicketBooking.Entity.Buses;
import com.assignment.TicketBooking.Entity.Tickets;

public class SingleTon {
	
	private static SessionFactory sF;
	
	private SingleTon() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		
		if(sF==null) {
			Configuration confg = new Configuration();
			confg.configure();
//			confg.addAnnotatedClass(Buses.class);
			sF=confg.buildSessionFactory();
			return sF;
			}
		return sF;
	}
}
