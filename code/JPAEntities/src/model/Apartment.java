package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the apartment database table.
 * 
 */
@Entity
@NamedQuery(name="Apartment.findAll", query="SELECT a FROM Apartment a")
public class Apartment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String block;

	private int buildingno;

	private String city;

	private String roomno;

	private String roomsize;

	private String street;

	private int zipcode;

	public Apartment() {
	}

	public String getBlock() {
		return this.block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public int getBuildingno() {
		return this.buildingno;
	}

	public void setBuildingno(int buildingno) {
		this.buildingno = buildingno;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomno() {
		return this.roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	public String getRoomsize() {
		return this.roomsize;
	}

	public void setRoomsize(String roomsize) {
		this.roomsize = roomsize;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}