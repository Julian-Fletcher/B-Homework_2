package homework2;

public class Student {
	private int id;
	private String name;
	private double grade;
	

	
	// toString() method
	@Override
	public String toString() {
		return "Student [id: " + id + ", name: " + name + ", grade: " + grade + "]";
	}


	// Getters and Setters below
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getGrade() {
		return grade;
	}



	public void setGrade(double grade) {
		this.grade = grade;
	}

	
	// Default constructor?
	public Student() {
		
	}


	// Constructor with all values
	public Student(int id, String name, double grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	
	
	
}
