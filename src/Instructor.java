
public class Instructor extends User {

	private String lectureGive;
	private double salary;

	public String getLectureGive() {
		return lectureGive;
	}

	public void setLectureGive(String lectureGive) {
		this.lectureGive = lectureGive;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String getPersonCode() {
		return "In"+"-"+this.getLastName().substring(0, 1)+this.getId();
	}
}
