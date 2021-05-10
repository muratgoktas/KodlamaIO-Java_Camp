
public class InstructorManager extends UserManager {

	private BaseLogger baseLogger;
	private Instructor instructor;

	public InstructorManager(BaseLogger baseLogger, Instructor instructor) {
		this.baseLogger = baseLogger;
		this.instructor = instructor;
	}

	public InstructorManager() {
		// Liste BasePersonManagerden direk kulanýlýyor. Burada @Override edilmiyor.
		// Bu sebeple boþ constructor sayesinde buþu boþuna Baselogger ve BasePerson un
		// cocuklarý new lenmemiþ olur.
		// "new lemek çok pahalýdýr." Engin Demiroð.
	}

	@Override
	public void add() {
		System.out.println("Added!");
		this.baseLogger.log(this.instructor.getName() + "-Instructor added!Log Logged!.");
	}

	@Override
	public void delete() {
		System.out.println("Deleted!");
		this.baseLogger.log(this.instructor.getName() + "-Instructor deleted!Log Loged!.");
	}

	@Override
	public void update() {
		System.out.println("Updated!");
		this.baseLogger.log(this.instructor.getName() + "-Instructor update!Log Loged!.");
	}
	/*
	 * Listeyi BasePersonManager den direk miras alsýn.
	 * 
	 * @Override public void list() { System.out.println("Listed!");
	 * this.baseLogger.log(this.instructor.getName() +
	 * "-Instructor listed!Log Loged!.");
	 * 
	 * }
	 */
}
