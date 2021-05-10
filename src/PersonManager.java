
public class PersonManager extends UserManager {

	private User[] users;
	private BaseLogger baseLogger;

	public PersonManager( BaseLogger baseLogger,User[] users) {
		this.users = users;
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("Added!");
		for (User user : users) {
			this.baseLogger.log(user.getPersonCode() + " " + user.getName() + " user added!Log Logged!.");
		}
	}
	public void delete() {
		System.out.println("Deleted!");
		for (User user : users) {
			this.baseLogger.log(user.getPersonCode() + " " + user.getName() + " user delete!Log Logged!.");
		}
	}
	
	public void update() {
		System.out.println("Updated!");
		for (User user : users) {
			this.baseLogger.log(user.getPersonCode() + " " + user.getName() + " user update!Log Logged!.");
		}
	}
	

}
