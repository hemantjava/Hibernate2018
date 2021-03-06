package orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Person {
	// Id generated by default by hibernate
	
	  @Id
	  @SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", initialValue = 5000, allocationSize = 100)
	  @GeneratedValue(generator = "mySeqGen")
	@Column(name="personId_PK")
	private int id;
	private String personName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	

	@Override
	public String toString() {
		return "Person [id=" + id + ", personName=" + personName +"]";
	}

}
