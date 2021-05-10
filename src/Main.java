
public class Main {

	public static void main(String[] args) {
//*************** Student Data Input start *******************************
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Kayra");
		student1.setMiddleName("Deniz");
		student1.setLastName("GÖKTAÞ");
		student1.setNickName("G@KT@S");
		student1.setPassword("123Ab!8@");
		student1.seteMail("kayra@kayra.com");
		student1.setPhotoUrl("kayraimages.jpg");
		student1.setBirthDate("23/04/1920");
		student1.setLessonName("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)");
		student1.setPointsReceive(70);
		student1.setActive(true);

		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Murat");
		student2.setLastName("GÖKTAÞ");
		student2.setNickName("mcs_gok");
		student2.setPassword("574Cb!7@");
		student2.seteMail("murat@murat.com");
		student2.setPhotoUrl("muratimages.jpg");
		student2.setBirthDate("29/05/1453");
		student2.setLessonName("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)");
		student2.setPointsReceive(10);
		student2.setActive(true);
//*************** Instructor Data Input start *******************************
		Instructor instructor1 = new Instructor();
		instructor1.setId(3);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.setNickName("IhaveMCT_PMP");
		instructor1.setPassword("999Xx!9@");
		instructor1.seteMail("engin@engin.com");
		instructor1.setPhotoUrl("enginimages.jpg");
		instructor1.setBirthDate("29/10/1923 ");
		instructor1.setLectureGive("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)");
		instructor1.setSalary(27);
		instructor1.setActive(true);
		
//*************** Instructor Data Input finish *******************************
		Student[] students = new Student[] { student1, student2 };
		/* KodlamaUI kullanýcý arayüzünden iþlem yapýlýyor artýk
		 * StudentManager studentManager1 = new StudentManager(new FileLogger(),
		 * students); studentManager1.add();
		 */

		//User[] users = { student1, instructor1 };
		/* KodlamaUI kullanýcý arayüzünden iþlem yapýlýyor artýk
		 * PersonManager personManager= new PersonManager(new EmailLogger(), users);
		 * personManager.delete();
		 */
		
		KodlamaUI kodlamaUI = new KodlamaUI();
		kodlamaUI.PeopleAdd(new StudentManager(new FileLogger(), students));
		kodlamaUI.PeopleList(new StudentManager());
		kodlamaUI.PeopleUpdate(new StudentManager(new FileLogger(), students));
		
		kodlamaUI.PeopleList(new InstructorManager());
		kodlamaUI.PeopleAdd(new InstructorManager(new FileLogger(),instructor1));
		kodlamaUI.PeopleUpdate(new InstructorManager(new FileLogger(),instructor1));
		
	}

}
