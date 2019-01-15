package exercise3;

import java.util.Comparator;

public class CompareByPhone implements Comparator<Student> {

	public int compare(Student arg0, Student arg1) {
		
		return arg0.getPhone().compareTo(arg1.getPhone());
	}
}
