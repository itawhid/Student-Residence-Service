package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the admincontractapartmentrel database table.
 * 
 */
@Entity
@Table(name="admincontractapartmentrel")
@NamedQuery(name="Admincontractapartmentrel.findAll", query="SELECT a FROM Admincontractapartmentrel a")
public class Admincontractapartmentrel  {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false)
	@Id
	private int adminID;

	@Column(nullable=false)
	private int apartmentID;

	@Column(nullable=false)
	private int contractID;

	public Admincontractapartmentrel() {
	}

	public int getAdminID() {
		return this.adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public int getApartmentID() {
		return this.apartmentID;
	}

	public void setApartmentID(int apartmentID) {
		this.apartmentID = apartmentID;
	}

	public int getContractID() {
		return this.contractID;
	}

	public void setContractID(int contractID) {
		this.contractID = contractID;
	}

}