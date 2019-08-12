package hibernate.tutorial.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Skills {

	@Column(name="Skils")
	private String primarySkills;

	public String getPrimarySkills() {
		return primarySkills;
	}

	public void setPrimarySkills(String primarySkills) {
		this.primarySkills = primarySkills;
	}
	
	
}
