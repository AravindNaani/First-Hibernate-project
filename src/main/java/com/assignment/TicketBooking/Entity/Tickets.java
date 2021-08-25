package com.assignment.TicketBooking.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ticket_details")
public class Tickets implements Serializable {
	
	@Id
	@Column(name="id")
	@GenericGenerator(name="i_auto", strategy = "increment")
	@GeneratedValue(generator="i_auto")
	private int ticketId;
	
	@Column(name="bus_from")
	private String busFrom;
	
	@Column(name="destination")
	private String busDestination;
	
	@Column(name="travel_date")
	private Date travelDate;
	
	@Column(name="price")
	private double ticket_price;
	
	@Column(name="number_of_passengers")
	private int numOfPassengers;
	
	@Column(name="booking_status")
	private String status;
	
	
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getBusFrom() {
		return busFrom;
	}
	public void setBusFrom(String busFrom) {
		this.busFrom = busFrom;
	}
	public String getBusDestination() {
		return busDestination;
	}
	public void setBusDestination(String busDestination) {
		this.busDestination = busDestination;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public double getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(double ticket_price) {
		this.ticket_price = ticket_price;
	}
	public int getNumOfPassengers() {
		return numOfPassengers;
	}
	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
