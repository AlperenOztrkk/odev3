package odev3;

public class Student extends User {
    private int courseCount;

public Student() {
	super();
}
public Student(int id, String firstName, String lastName, String emailAdress, String nationalIdentity,
		double courseScore) {
	super(id, firstName, lastName, emailAdress, nationalIdentity);
	this.courseCount = courseCount;
}
public int getCourseCount() {
	return courseCount;
}
public void setCourseCount(int courseCount) {
	this.courseCount = courseCount;
}

}