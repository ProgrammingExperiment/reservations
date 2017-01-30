package com;

public class Reservation{
	
	private final long id;
	private final Site location;
	private final Inventory inventory;
	private final String checkInDate;
	private final String checkOutDate;
	private final String reservationNumber;
	
	//Constructor
	// it initiates every new 'Reservation' you create.	
	public Reservation( long _id, 
			String _checkInDate, 
			String _checkOutDate, 
			String _reservationNumber, 
			Site _location,  
			Inventory inv){
		this.id = _id;
		this.checkInDate  = _checkInDate;
		this.checkOutDate = _checkOutDate;
		this.reservationNumber = _reservationNumber;
		this.location = _location;
		this.inventory=inv;
	}
	
	public Inventory getInventory(){
		return this.inventory;
	}
	public long getId(){
		return this.id;
	}
	
	public Site getLocation(){
		return this.location;
	}
	
	public String getCheckInDate(){
		return this.checkInDate;
	}
	
	public String getCheckOutDate(){
		return this.checkOutDate;		
	}
	
	public String getReservationNumber(){
		return this.reservationNumber;
	}
	
}