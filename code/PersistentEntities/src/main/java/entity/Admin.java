package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the admin database table.
 * 
 */
@Entity
@Table(name="admin")
@NamedQuery(name="Admin.findAll", query="SELECT a FROM Admin a")
public class Admin  {

	@Column(length=45)
	private String contactno;


	@Column(length=100)
	private String email;

	@Column(nullable=false, length=1)
	private String groupV;


	@Column(nullable=false)
	@Id
	private int id;


	@Column(length=200)
	private String name;


	@Column(length=100)
	private String username;

	public Admin() {
	}


	public String getContactno() {
		return this.contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}


	

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	


	public String getGroupV() {
		return this.groupV;
	}

	public void setGroupV(String groupV) {
		this.groupV = groupV;
	}




	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}