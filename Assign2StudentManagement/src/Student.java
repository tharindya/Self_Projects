
public class Student implements Comparable<Student> {

	private String name;
	private int id;
	private String email;
	private double grade;
	
	public Student(String name,int id,String email,double grade) {
		this.name=name;
		this.id=id;
		this.email=email;
		this.grade=grade;
	}
	/**
	 * 
	 * @return
	 */
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	/**
	 * 
	 * @return
	 */
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id=id;
	}
	/**
	 * 
	 * @return
	 */
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email=email;
	}
	/**
	 * 
	 * @return
	 */
	public double getgrade() {
		return grade;
	}
	
	public void setgrade(double grade) {
		this.grade=grade;
	}
	
	public int compareTo(Student other) {
		return Double.compare(this.grade, other.grade);
	}
	
	public String toString() {
		return "Student{name='"+ name +"', id="+id+", email='"+email
				+"', grade="+grade+"}";
	}
}
