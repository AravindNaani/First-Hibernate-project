package com.assignment.TicketBooking.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="bus_details")
public class Buses implements Serializable {
	
	@Id
	@Column(name="id")
	@GenericGenerator(name="i_auto", strategy = "increment")
	@GeneratedValue(generator="i_auto")
	private int busId;
	
	@Column(name="name")
	private String busName;
	
	@Column(name="time")
	private String busTimings;
	
	@Column(name="bus_from")
	private String busFrom;
	
	@Column(name="destination")
	private String busDestination;
	
	@Column(name="ticket_price")
	private double ticketPrice;
	
	
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusTimings() {
		return busTimings;
	}
	public void setBusTimings(String busTimings) {
		this.busTimings = busTimings;
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
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "Buses [busId=" + busId + ", busName=" + busName + ", busTimings=" + busTimings + ", busFrom=" + busFrom
				+ ", busDestination=" + busDestination + ", ticketPrice=" + ticketPrice + "]";
	}

}
