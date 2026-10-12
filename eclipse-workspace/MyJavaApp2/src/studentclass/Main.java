package studentclass;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		
		student1.name ="Samantha Price";
		student1.major ="Business Managment";
		student1.gpa =3.2;
		
Student student2 = new Student();
		
		student2.name ="Roger Donald";
		student2.major ="Health Care";
		student2.gpa =2.1;


		student1.displayInfo();
		student2.displayInfo();
	}

}
