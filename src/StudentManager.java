
public class StudentManager extends UserManager {
	private BaseLogger baseLogger;
	private Student[] students;

	public StudentManager(BaseLogger baseLogger, Student[] students) {
		this.baseLogger = baseLogger;
		this.students = students;
	}
	
	public StudentManager() {
		// Liste BasePersonManagerden direk kulan�l�yor. Burada @Override edilmiyor.
		// Bu sebeple bo� constructor sayesinde bu�u bo�una Baselogger ve BasePerson un 
		// cocuklar� new lenmemi� olur.
		// "new lemek �ok pahal�d�r." Engin Demiro�.	
	}

	@Override
	public void add() {
		System.out.println("Added!");
		for (Student student : students) {
			this.baseLogger.log(student.getName() + " student added!Log Logged!.");
		}

	}

	@Override
	public void delete() {
		System.out.println("Deleted!");
		for (Student student : students) {
			this.baseLogger.log(student.getName() + " student deleted!Log Logged!.");
		}

	}

	@Override
	public void update() {
		System.out.println("Update!");
		for (Student student : students) {
			this.baseLogger.log(student.getName() + " student updated!Log Logged!.");
		}

	}

}
