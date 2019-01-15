package exercise3;

import java.util.Comparator;

public class CompareByAge implements Comparator<Student> {

	
	public int compare(Student arg0, Student arg1) {
		
		return arg0.getAge().compareTo(arg1.getAge());
		
	}
}
