package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the contract database table.
 * 
 */
@Entity
@NamedQuery(name="Contract.findAll", query="SELECT c FROM Contract c")
public class Contract{
	private static final long serialVersionUID = 1L;

	private String apartment;

	@Temporal(TemporalType.TIMESTAMP)
	private Date creationdate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date enddate;

	@Id
	private int idcontract;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startdate;

	private Object status;

	public Contract() {
	}

	public String getApartment() {
		return this.apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public Date getCreationdate() {
		return this.creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public int getIdcontract() {
		return this.idcontract;
	}

	public void setIdcontract(int idcontract) {
		this.idcontract = idcontract;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Object getStatus() {
		return this.status;
	}

	public void setStatus(Object status) {
		this.status = status;
	}

}