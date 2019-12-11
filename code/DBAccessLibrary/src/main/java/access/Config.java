package access;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entities.Admin;
import entities.Auth;

/**
 * This class inputs DB connection setup parameters and creates the connection 
 * to Required Database. 
 * Class does not depends on the database type of any sort. This is managed by 
 * JPA. <i><b> @see access.Config.class is a singleton class.</b></i>.
 * Why do we need multiple instance per user for database access.This is bullshit if 
 * you tell me this. And ofcourse the class is immutable.(This autimatically becomes 
 * threadsafe- Inherently)
 * 
 * @author Kowshik Dipta Das Joy
 *
 */
public final class Config {

	private static Config object;
	
	private final  String dbLink;
	
	private final String userName;
	
	private final String key;
	
	private EntityManager entityManager;
	
	
	private Config(String dbLink, String userName , String key) {
		
		this.dbLink=dbLink;
		this.userName=userName;
		this.key=key;
	}
	
	public static Config Instance() throws Exception {
		if(Config.object==null)
				throw new Exception("Please specify Database Connection , username and key");
		return Config.object;
	}
	/**
	 * Inputs DB Connection URL , User Name and Password .
	 * @return Returns the instance of Configure and connect Object.
	 */
	public static Config Instance(String dbLink, String userName, String key) {
		if(Config.object==null)
				Config.object=new Config(dbLink, userName, key);
	
		return Config.object;
		
	}
	
	/**
	 * Before making a connection we need to create the property. Optionally We could have defined 
	 * it in the persistent xml file but by doing this we can pass the properties programatically. 
	 * Require group decision ... I am a but confused in here!
	 * @return Config class object.
	 */
	public Config Connect() {
		
		Properties props = new Properties();
		props.setProperty("javax.persistence.jdbc.url", this.dbLink);
		props.setProperty("javax.persistence.jdbc.user", this.userName);
		props.setProperty("javax.persistence.jdbc.password", this.key);
		
		this.entityManager = Persistence.createEntityManagerFactory("DBAccessLibrary")
											 .createEntityManager();
		
										
		return Config.object;
	}
	
	
	public Config transact() {
		
		Admin a = new Admin();
		a.setContactno("+491788770363");
		a.setEmail("koushikjay66@gmail.com");
		a.setGroupV("SUPERADMIN");
		a.setName("Koushik Jay");
		a.setUsername("koushikjay66");
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Auth b = new Auth();
		b.setAuthkey("kalal");
		b.setId(0);
		entityManager.persist(a);
		transaction.commit();
		
		return Config.object;
	}
	
	
	
}
