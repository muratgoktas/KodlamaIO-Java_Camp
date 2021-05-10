
public class Student extends User {

	private String lessonName;
	private double pointsReceive;
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public double getPointsReceive() {
		return pointsReceive;
	}
	public void setPointsReceive(double pointsReceive) {
		this.pointsReceive = pointsReceive;
	}
	@Override
	public String getPersonCode() {
		return "St"+"-"+this.getLastName().substring(0,1)+this.getId();
	}

}
