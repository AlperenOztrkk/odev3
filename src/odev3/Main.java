package odev3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1,"Alperen","Öztürk","alpeea@fafasf","2522255",114.);
		Instructor instructor2 = new Instructor(2, "Recep", "Bayindir", "rc@q@@@", "0205741", 11599);

		Student student1 = new Student(3, "Alperen", "Ozturk", "alperen@agmaif.com", "852252", 5);
		Student student2 = new Student(4, "Seher", "Yalcin", "seher@sedefcom", "4499888785", 2);

		User[] users = { instructor1, instructor2, student1, student2 };

		UserManager userManager = new UserManager();
		userManager.addMultiple(users);

		System.out.println("--------------------------");

		userManager.deleteMultiple(users);
		System.out.println("--------------------------");

		userManager.updateMultiple(users);
		System.out.println("--------------------------");

		Student[] students = { student1, student2 };

		StudentManager studentManager = new StudentManager();
		studentManager.addMultiple(students);
		System.out.println("--------------------------");
		

		Instructor[] instructors = { instructor1, instructor2 };

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addMultiple(instructors);

		studentManager.getCourseNumber(student1);
		instructorManager.getSalary(instructor1);
	}
	}


