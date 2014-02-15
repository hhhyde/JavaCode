package a9_22;

import java.util.Comparator;

public class ComparaName implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		return stu1.getName().compareTo(stu2.getName());
	}

}
