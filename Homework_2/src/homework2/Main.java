package homework2;

public class Main {

	public static void main(String[] args) {
		
		// Instantiate StudentManager, perform operations based on the requirements.
		StudentManager studentManager = new StudentManager();
		
		
		/* *** TEST """METHODS""" ON EMPTY UNINITIALIZED STUDENT ARRAY HERE ??
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		// Read student data from a file and initialize Student objects.
		System.out.println("**** TESTING READ FILE ****");
		boolean fileReadStatus1 = studentManager.readFromFile("src/homework2/studentData.txt");
		boolean fileReadStatus2 = studentManager.readFromFile("hi");
		
		System.out.println("Expected true from fileRead and got: " + fileReadStatus1);
		System.out.println("Expected false from fileRead and got: " + fileReadStatus2);
		
		// Display all students.
		System.out.println();
		System.out.println("**** DISPLAYING STUDENTS ****");
		studentManager.displayStudents();
		
		// Search for a student by ID.
		System.out.println();
		System.out.println("**** TESTING SEARCH STUDENT ****");
		boolean studentFound = studentManager.searchStudentById(101);
		boolean studentNotFound = studentManager.searchStudentById(-100);
		
		System.out.println("Expected true from searchStudent and got: " + studentFound);
		System.out.println("Expected false from searchStudenta nd got: " + studentNotFound);
		
		
		// Update the grade of a student by ID.
		System.out.println();
		System.out.println("**** TESTING UPDATE STUDENT ****");
		boolean studentGradeUpdateStatus = studentManager.updateStudentGradeById(102, 95);
		boolean studentUpdate = studentManager.updateStudentGradeById(69, 1000);
		boolean sillyUpdate = studentManager.updateStudentGradeById(102, 100000);
		
		System.out.println("Expected true from update and got: " + studentGradeUpdateStatus);
		System.out.println("Expected false from update and got: " + studentUpdate);
		System.out.println("Expected true from update and got: " + sillyUpdate);
		
		// Display all students after the update.
		System.out.println();
		System.out.println("**** DISPLAYING FINAL STUDENTS ****");
		studentManager.displayStudents();
		
	}

}
