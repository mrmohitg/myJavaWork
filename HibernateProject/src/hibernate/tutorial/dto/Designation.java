package hibernate.tutorial.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

@Embeddable
public class Designation {
	
	@GeneratedValue()
	@Column(name="User_Designation_Id")
	private String designationId;
	
	@Column(name="User_Designation_Name")
	private String designationName;
	
	public String getDesignationId() {
		return designationId;
	}

	public void setDesignationId(String designationId) {
		this.designationId = designationId;
	}

	public String getDesignationName() {
		return designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}

	

}
