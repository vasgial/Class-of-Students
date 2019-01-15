package exercise3;

import java.util.Comparator;

public class CompareByName implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.getSurname().compareTo(arg1.getSurname());
	}

	
	
}
