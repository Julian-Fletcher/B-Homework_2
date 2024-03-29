package homework2;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StudentManager {

	private Student[] students;

	public StudentManager() {
		this.students = new Student[50];
	}

	public boolean updateStudentGradeById(int id, double grade) {
		for (int i = 0; i < students.length; i++) // search for the given id in the array
		{
			if (students[i] != null) // added null checking for students
			{
				if (students[i].getId() == id) // if you find the correct student change the grade
				{
					System.out.println("Grade Updated. Student with ID: " + id + " was found"); // added output for
																								// confirming changes
					students[i].setGrade(grade);
					return true;
				}
			}
		}
		System.out.println("Grade was NOT changed. No student found with ID: " + id); // added output warning that no
																						// grade change was made
		return false; // if you searched the array and don't find the given id, return false
	}

	public boolean readFromFile(String filename) {

		// initialize file collection
		
		
		
		FileInputStream filescan;

		try {
			// Collect file and init scanner
			filescan = new FileInputStream(filename);
			
			Scanner scanner = new Scanner(filescan, "UTF-8");
			// Create for array index
			int count = 0;
			// Add each value of a student to student in array per entry
			while (scanner.hasNextLine()) {
				// Makes sure new line is not an empty new line
				if (scanner.hasNextInt()) {
					scanner.nextLine();
					count++;
				} else {
					// If new line is empty, ignore and end while loop
					break;
				}
			}
			this.students = new Student[count];
			scanner.close();

		} catch (FileNotFoundException e) {
			return false;
		}
		
		
		
		
		
		FileInputStream file;

		try {
			// Collect file and init scanner
			file = new FileInputStream(filename);
			
			Scanner scanner = new Scanner(file, "UTF-8");
			// Create for array index
			int count = 0;
			// Add each value of a student to student in array per entry
			while (scanner.hasNextLine()) {
				// Makes sure new line is not an empty new line
				if (scanner.hasNextInt()) {
					Student temp = new Student();
					int id = scanner.nextInt();
					String name = scanner.next();
					name = name + " " + scanner.next();
					double grade = scanner.nextDouble();
					temp.setId(id);
					temp.setName(name);
					temp.setGrade(grade);
					students[count] = temp;
					count++;
				} else {
					// If new line is empty, ignore and end while loop
					break;
				}
			}
			scanner.close();
			if (count == 0) {
				// No items to return... return false
				return false;
			}
			// Close scanner

			return true;
		} catch (FileNotFoundException e) {
			// If file could not open, alert user
			
			return false;
		}
	}

	// Searches for a student by their id
	public boolean searchStudentById(int id) {
		// Loop through array, compare student ID unless the array location is NULL
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getId() == id) {
					System.out.println("Student found: " + students[i].toString()); // Print the student was found and
																					// their toString()
					return true;
				}
			}
		}
		// No student found!
		System.out.println("Student not found!");
		return false;
	}

	// Display Student
	public void displayStudents() {
		if (students == null || students.length == 0) {
			System.out.println("No students to display.");
			return;
		}

		System.out.println("Details of all students:");
		for (Student student : students) {
			if (student != null) {
				System.out.println(student.toString());
			}
		}
	}
}
