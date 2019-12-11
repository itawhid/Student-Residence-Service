package entity;

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
public class User  {
	private static final long serialVersionUID = 1L;

	@Lob
	private String address;

	@Column(length=100)
	private String contactno;

	@Column(name="contract_idcontract", nullable=false)
	private int contractIdcontract;

	@Column(name="CURRENT_CONNECTIONS", nullable=false)
	private BigInteger currentConnections;

	private byte currenttenentstatus;

	@Column(length=100)
	private String email;

	@Column(nullable=false, length=500)
	private String firstname;

	@Column(nullable=false)
	@Id
	private int id;

	@Column(nullable=false, length=500)
	private String lastname;

	@Column(nullable=false, length=500)
	private String middlename;

	@Column(name="TOTAL_CONNECTIONS", nullable=false)
	private BigInteger totalConnections;

	@Column(length=16)
	private String user;

	@Column(length=100)
	private String username;

	public User() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
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

	public byte getCurrenttenentstatus() {
		return this.currenttenentstatus;
	}

	public void setCurrenttenentstatus(byte currenttenentstatus) {
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