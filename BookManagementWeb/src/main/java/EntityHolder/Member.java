package EntityHolder;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

//@SuppressWarnings("serial")
@Entity
@XmlRootElement
public class Member implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY.AUTO)
	private int memberid;
	private String fname;
	private String lname;
	private String adress;
	private String phonemumber;
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Member(String fname, String lname, String adress, String phonemumber) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.adress = adress;
		this.phonemumber = phonemumber;
	}

	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhonemumber() {
		return phonemumber;
	}
	public void setPhonemumber(String phonemumber) {
		this.phonemumber = phonemumber;
	}



	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", fname=" + fname + ", lname=" + lname + ", adress=" + adress
				+ ", phonemumber=" + phonemumber + "]";
	}
	

}
