/**
 * 
 */
package com.tis.mgr.resto.service.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author mardubudi
 *
 */

@Entity
public class Reservation implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8144902351167441671L;
	
	@Id
	@GeneratedValue
	private Long id ;
	private String reservationName ;
	
	
	
	public Reservation(String n) {
		this.reservationName = n;
	}
	
	public Reservation() {
		// But this for JPA
	}
	
	@Override
	public String toString() {

		return "Reservation {ID : "+id+" Reservation Name :"
				+ reservationName
				+ "}";
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReservationName() {
		return reservationName;
	}

	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}

}
