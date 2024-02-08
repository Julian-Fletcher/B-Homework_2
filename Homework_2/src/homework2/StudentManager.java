package homework2;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class StudentManager {

private Student[] students;



public StudentManager() {
	
	this.students = new Student[10];
	
}



public boolean readFromFile(String filename){

FileInputStream file;
try {
	file = new FileInputStream(filename);
	Scanner scanner = new Scanner(file, "UTF-8");
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
	// TODO Auto-generated catch block
	e.printStackTrace();
	return false;
}






}

}





