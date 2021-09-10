import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> al=new ArrayList<Student>();
		System.out.println("Student List(ordered bt name)");
		Student s1=new Student(101,"Kim",23);
		al.add(s1);
		Student s2=new Student(102,"Choi",21);
		al.add(s2);
		al.add(new Student(103,"Park",25));
		al.add(new Student(104,"Lim",22));
		al.add(new Student(105,"Lee",20));
		al.add(new Student(106,"Kang",24));
		al.add(new Student(107,"Jung",26));
		al.add(new Student(108,"Ha",27));
		al.add(new Student(109,"Yun",29));
		al.add(new Student(100,"Na",28));
		
		Collections.sort(al);
		for(Student s : al){
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i).toString());
		}
	}
}
