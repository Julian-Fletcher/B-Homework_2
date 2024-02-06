package homework2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class StudentManager {

private Student[] students;



public StudentManager() {
	
	this.students = new Student[10];
	
}



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

}




}
