package homework2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class StudentManager {

private Student[] students;



public StudentManager() {
	
	this.students = new Student[10];
	
}


// Comment your code Braeden!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public boolean readFromFile(String filename){

File file = new File(filename);

Scanner scanner;
try {
	scanner = new Scanner(file);
	int count = 0;
	while (scanner.hasNextLine()){
		
		Student temp = new Student();
		int id = scanner.nextInt();
		String name = scanner.next();
		double grade = scanner.nextDouble();
	    temp.setId(id);
	    temp.setName(name);
	    temp.setGrade(grade);
	    students[count] = temp;
	    count++;
	}
	
	scanner.close();
	return true;
} catch (FileNotFoundException e) {
	e.printStackTrace();
	return false;
}



}
	
	// Searches for a student by their id
	public boolean searchStudentById(int id) {
		// Loop through array, compare student ID unless the array location is NULL
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				if(students[i].getId() == id) {
					System.out.println("Student found: " + students[i].toString()); // Print the student was found and their toString()
					return true;
				}
			}
		}
		// No student found!
		System.out.println("Student not found!");
		return false;
	}

}





