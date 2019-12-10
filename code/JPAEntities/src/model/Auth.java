package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the auth database table.
 * 
 */
@Entity
@NamedQuery(name="Auth.findAll", query="SELECT a FROM Auth a")
public class Auth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String authkey;

	private String hash;

	

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastlogin;

	private String password;

	private String salt;

	private String userid;

	public Auth() {
	}

	public String getAuthkey() {
		return this.authkey;
	}

	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getLastlogin() {
		return this.lastlogin;
	}

	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}