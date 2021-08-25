package com.assignment.TicketBooking;

import java.util.Date;

import com.assignment.TicketBooking.Dao.BusesDao;
import com.assignment.TicketBooking.Dao.TicketsDao;
import com.assignment.TicketBooking.Entity.Buses;
import com.assignment.TicketBooking.Entity.Tickets;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         BusesDao dao = new BusesDao();
         dao.getBusList("KKD", "RCPM").forEach(each ->{System.out.println(each);});
    	
    	Tickets ticket1 = new Tickets();
    	ticket1.setBusFrom("RCPM");
    	ticket1.setBusDestination("RJY");
    	ticket1.setTicket_price(134.54);
    	ticket1.setTravelDate(new Date());
    	ticket1.setNumOfPassengers(2);
    	ticket1.setStatus("pending");
    	
//    	TicketsDao dao = new TicketsDao();
//    	dao.bookTicket(ticket1);
//    	dao.conformBookedTicket(1012);
//    	dao.cancleTicket(1012);
    }
}
