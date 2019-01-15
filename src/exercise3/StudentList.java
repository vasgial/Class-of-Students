package exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentList {
	
	private ArrayList<Student> studentList;
	
	public StudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public StudentList() {
		studentList = readFile("src/exercise3/Lab3_Names.txt");
	}

	public ArrayList<Student> getStudentList() {
		//System.out.println(studentList.size());
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Student> readFile(String fileName) {
		
		 try {

	            File f = new File(fileName);
	            
	            BufferedReader b = new BufferedReader(new FileReader(f));

	            String readLine = "";
	            ArrayList<Student> studentList = new ArrayList<Student>();
	            
	            b.readLine();
	            
	            while ((readLine = b.readLine()) != null) {    //edw dyskoleuthka arketa, zhthsa vohtheia
	            		
	            	String[] str = readLine.split(",");
	            	
	            	Student student  = new Student(str[0], str[1], str[2], str[3], str[4], str[5], str[6], "Good"); 
	            
	            	studentList.add(student);
	            	
	            	//System.out.println(studentList.size());
	
	            	//System.out.println(student);
	            	
	            }
	            return studentList;
	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        }
	}

	
	public void editConduct() {
		
		System.out.println("Please give me the student's surname: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
			for(int i = 0 ; i<studentList.size() ; i++) {
				Student st = studentList.get(i);
				if (studentList.get(i).getSurname().equals(name)) {
				
						System.out.println("You have two choices:");
						System.out.println("1.Poor.");
						System.out.println("2.Good.");
						System.out.println("3.Excellent.");
						System.out.println("Enter 1 or 2: ");
						String enter = sc.nextLine();
						
						if(enter.equals("1")) {
							( studentList.get(i) ).setConduct("Poor");
						}
						else if(enter.equals("2")) {
							( studentList.get(i) ).setConduct("Good");
						}
						else {
							( studentList.get(i) ).setConduct("Excellent");
							//st.setConduct("Excellent");
						}		
				}
				} 
			System.out.println("You gave no exist surname.");
			}			
	}

