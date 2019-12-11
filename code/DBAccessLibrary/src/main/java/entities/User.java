package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User{
	private static final long serialVersionUID = 1L;

	private Object address;

	private String contactno;

	@Column(name="contract_idcontract")
	private int contractIdcontract;

	@Column(name="CURRENT_CONNECTIONS")
	private BigInteger currentConnections;

	private Object currenttenentstatus;

	private String email;

	private String firstname;

	@Id
	private int id;

	private String lastname;

	private String middlename;

	@Column(name="TOTAL_CONNECTIONS")
	private BigInteger totalConnections;

	private String user;

	private String username;

	public User() {
	}

	public Object getAddress() {
		return this.address;
	}

	public void setAddress(Object address) {
		this.address = address;
	}

	public String getContactno() {
		return this.contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public int getContractIdcontract() {
		return this.contractIdcontract;
	}

	public void setContractIdcontract(int contractIdcontract) {
		this.contractIdcontract = contractIdcontract;
	}

	public BigInteger getCurrentConnections() {
		return this.currentConnections;
	}

	public void setCurrentConnections(BigInteger currentConnections) {
		this.currentConnections = currentConnections;
	}

	public Object getCurrenttenentstatus() {
		return this.currenttenentstatus;
	}

	public void setCurrenttenentstatus(Object currenttenentstatus) {
		this.currenttenentstatus = currenttenentstatus;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public BigInteger getTotalConnections() {
		return this.totalConnections;
	}

	public void setTotalConnections(BigInteger totalConnections) {
		this.totalConnections = totalConnections;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}