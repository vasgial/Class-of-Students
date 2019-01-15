package exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainStudent {
	
	private static StudentList stl;
	
	public static void printList() {
		
		for(int i = 0 ; i<stl.getStudentList().size() ; i++) {
			System.out.println(stl.getStudentList().get(i));
		}
	} 

	
	public static void main(String [] args) {

		stl  = new StudentList();
		
		boolean running = true;
		while(running) {
			Scanner sc = new Scanner(System.in);
			System.out.println("What do you want to do?");
			System.out.println("1.Print student list? ");
			System.out.println("2.Print student list sorted by surname? ");
			System.out.println("3.Print student list sorted by age? ");
			System.out.println("4.Print student list sorted by telephone? ");
			System.out.println("5.Do you want edit the student's conduct? ");
			String enter = sc.nextLine();
			
			if(enter.equals("1")) {
				printList();
			}
			
			else if(enter.equals("2")) {
				Collections.sort(stl.getStudentList(), new CompareByName());
				printList();
			}
			else if(enter.equals("3")) {
				Collections.sort(stl.getStudentList(), new CompareByAge());
				printList();
			}
			else if(enter.equals("4")) {
				Collections.sort(stl.getStudentList(), new CompareByPhone());
				printList();
			}
			else if(enter.equals("5")) {
				stl.editConduct();	
				//printList();
			}
			System.out.println("Do you want to continue (Y/N):");
			String answer=sc.next();
			if(answer.equalsIgnoreCase("N")) {
				System.out.println("BYe");
				running=false;
				
			}
		}
	}


}
