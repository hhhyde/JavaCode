package a9_22;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MM {
	public static void main(String[] args) {
		List<Student> students = new LinkedList<Student>();
		students.add(new Student("环境", 3));
		students.add(new Student("控制", 5));
		students.add(new Student("武器", 4));
		listshow(students);
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		listshow(students);
		
	}

	static void listshow(List<Student> students) {
		for (Student student : students) {
			System.out.println(student.getName() + student.getAge() + "岁");
		}
	}
}
