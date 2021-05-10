

public class BasePerson {
	private int id;
	private String personCode;
	private String firstName;
	private String middleName;
	private String lastName;
	private String birthDate;
	private boolean active;
	
	private String eMail;
	private String photoUrl;

	public int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public final String getName() {
		if (this.middleName != " " && this.middleName!=null) {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
		return this.firstName + " " + this.lastName;

	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getPersonCode() {
		return personCode;
	}

}
