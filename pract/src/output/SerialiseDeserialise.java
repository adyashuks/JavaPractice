package output;

import java.io.Serializable;
import java.util.Date;

public class SerialiseDeserialise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String firstname;
	public String lastname;
	public Date bday;
	public SerialiseDeserialise(String firstname, String lastname, Date bday) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.bday = bday;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getBday() {
		return bday;
	}
	public void setBday(Date bday) {
		this.bday = bday;
	}
	
	
}
