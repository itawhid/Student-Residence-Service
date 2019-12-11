package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the appointment database table.
 * 
 */
@Entity
@NamedQuery(name="Appointment.findAll", query="SELECT a FROM Appointment a")
public class Appointment {
	private static final long serialVersionUID = 1L;

	private String assignedgroup;

	private int assignedto;

	@Column(name="contract_idcontract")
	private int contractIdcontract;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdate;

	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	private Date enddate;

	@Id
	private int id;

	private String priority;

	private int requesterID;

	private String status;

	private String title;

	public Appointment() {
	}

	public String getAssignedgroup() {
		return this.assignedgroup;
	}

	public void setAssignedgroup(String assignedgroup) {
		this.assignedgroup = assignedgroup;
	}

	public int getAssignedto() {
		return this.assignedto;
	}

	public void setAssignedto(int assignedto) {
		this.assignedto = assignedto;
	}

	public int getContractIdcontract() {
		return this.contractIdcontract;
	}

	public void setContractIdcontract(int contractIdcontract) {
		this.contractIdcontract = contractIdcontract;
	}

	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getRequesterID() {
		return this.requesterID;
	}

	public void setRequesterID(int requesterID) {
		this.requesterID = requesterID;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}