import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
	private List<Student> students;
	
	public StudentManager() {
		students = new ArrayList<>();
	}
	
	public void addStudents(Student student) {
		students.add(student);
	}
	
	public void remStudents(double id) {
		students.removeIf(student -> student.getid() == (id));
	}
	
	public void sortStudentsByGrade() {
		Collections.sort(students);
	}
	
	public void displayStudents() {
		for(Student student : students) {
			System.out.println(student);
		}
	}
	
	public List<Student> getStudents(){
		return students;
		
	}
}
