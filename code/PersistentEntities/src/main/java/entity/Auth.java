package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the auth database table.
 * 
 */
@Entity
@Table(name="auth")
@NamedQuery(name="Auth.findAll", query="SELECT a FROM Auth a")
public class Auth  {
	private static final long serialVersionUID = 1L;

	@Column(length=500)
	private String authkey;

	@Column(length=200)
	private String hash;

	@Column(nullable=false)
	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastlogin;

	@Column(length=1000)
	private String password;

	@Column(length=200)
	private String salt;

	@Column(length=100)
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