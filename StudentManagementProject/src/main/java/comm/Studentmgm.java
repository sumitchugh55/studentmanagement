package comm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Studentmgm {
	public static void main(String[] args) throws IOException {
		System.out.println("welcome to my application");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		while (true) {

			System.out.println("PRESS 1 to add a new Student");
			System.out.println("PRESS 2 to delete a student");
			System.out.println("PRESS 3 to dislplay Student");
			System.out.println("PRESS 4 to Exit");
			int c = Integer.parseInt(br.readLine());
			if (c == 1) {
				// Add a new Student
				System.out.println("Enter the username");
				String name=br.readLine();
				System.out.println("Enter the phone number");
				String phone=br.readLine();
				System.out.println("Enter the city");
				String city=br.readLine();
				Student st=new Student(name,phone,city);
				boolean answer=StudentDao.insertStudentToDb(st);
				if(answer) {
					System.out.println("Student is added successfully...");
				}
				else
					System.out.println("Somehting went wrong");
				System.out.println(st);
    
				
			} else if (c == 2) {
				// delete an existing student
				System.out.println("Enter student id to delete");
				int userId=Integer.parseInt(br.readLine());
				
				boolean f=StudentDao.deleteRecord(userId);
				if(f) {
					System.out.println("Record Deleted successfully");
				}
				else
					System.out.println("there is some problem");
			} else if (c == 3) {
 StudentDao.showAllStudents();
				// Display all Students
			} else if (c == 4) {
				// Exit the application
				break;
			} else {

			}

		}
		System.out.println("Thanks for using my application");
		System.out.println("See you again.....");
	}
}
