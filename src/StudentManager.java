
public class StudentManager extends UserManager {
	private BaseLogger baseLogger;
	private Student[] students;

	public StudentManager(BaseLogger baseLogger, Student[] students) {
		this.baseLogger = baseLogger;
		this.students = students;
	}
	
	public StudentManager() {
		// Liste BasePersonManagerden direk kulanýlýyor. Burada @Override edilmiyor.
		// Bu sebeple boþ constructor sayesinde buþu boþuna Baselogger ve BasePerson un 
		// cocuklarý new lenmemiþ olur.
		// "new lemek çok pahalýdýr." Engin Demiroð.	
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
