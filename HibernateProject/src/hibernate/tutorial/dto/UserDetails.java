package hibernate.tutorial.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="User_Details")
public class UserDetails {

	@Id()
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="User_Id")
	private int userID;
	
	@Column(name="User_Name")
	private String userName;
	
	@Temporal(TemporalType.DATE)
	@Column(name="User_DateOfJoining")
	private Date joiningDate;
	
	@Transient
	private String description;
	
	/*@Lob
	@Column(name="User_Address")
	private String address;*/
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street", column = @Column(name="Home_Street")),
	@AttributeOverride(name="city", column = @Column(name="Home_City")),
	@AttributeOverride(name="state", column = @Column(name="Home_State")),
	@AttributeOverride(name="pincode", column = @Column(name="Home_Pincode")),
	})
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street", column = @Column(name="Office_Street")),
	@AttributeOverride(name="city", column = @Column(name="Office_City")),
	@AttributeOverride(name="state", column = @Column(name="Office_State")),
	@AttributeOverride(name="pincode", column = @Column(name="Office_Pincode")),
	})
	private Address officeAddress;
	
	@Embedded
	@ElementCollection
	private Set<Skills> setOfskills = new HashSet<>();
	
	@ElementCollection
	@JoinTable(name="User_Designation")
	private Set<Designation> setOfDesignation = new HashSet<>();
	
	
	/*public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}*/

	public Set<Designation> getSetOfDesignation() {
		return setOfDesignation;
	}

	public void setSetOfDesignation(Set<Designation> setOfDesignation) {
		this.setOfDesignation = setOfDesignation;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Set<Skills> getSetOfskills() {
		return setOfskills;
	}

	public void setSetOfskills(Set<Skills> setOfskills) {
		this.setOfskills = setOfskills;
	}
}

