import java.util.Arrays;
/**
 * Entry class for the project
 */
public class MainClass {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Student student1 = new Student("Jade", 5, "jaedq12@gamail.com", 5.5);
		Student student2 = new Student("max black", 6, "maxx@gamail.com", 9.5);
		Student student3 = new Student("stephen thompson", 74, "stson@gamail.com", 4.2);
		Student student4 = new Student("Giger calson", 34, "gcalso@gamail.com", 7.1);

		Student[] studentArray = {student1, student2, student3, student4};
		
		StudentManager stMan = new StudentManager();
		stMan.addStudents(student1);
		stMan.addStudents(student2);
		stMan.addStudents(student3);
		stMan.addStudents(student4);
	
		System.out.println("Array before sorting");
		for(Student student : studentArray) {
			System.out.println(student);
		}
		
		Arrays.sort(studentArray);
		
		
		System.out.println("\nArray after sorting:");
        for (Student student : studentArray) {
            System.out.println(student);
        }
        
		System.out.println("\nArrayList before sorting");
		stMan.displayStudents();
		
		stMan.sortStudentsByGrade();
		System.out.println("\nArrayList after sorting");
		stMan.displayStudents();
		
	}

}
