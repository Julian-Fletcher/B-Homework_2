package homework2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Output!");
		
		// Instantiate StudentManager, perform operations based on the requirements.
		StudentManager studentManager = new StudentManager();
		
		// Read student data from a file and initialize Student objects.
		System.out.println(studentManager.readFromFile("src/homework2/studentData.txt"));
		

	}

}
