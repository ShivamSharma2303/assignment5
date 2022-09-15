

	import java.util.*;
	public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

	List<Student> std = new ArrayList<Student>();								// Creating list of type Student
			
			// Adding elements
			std.add(new Student(4,"Ranu",18,50));
			std.add(new Student(12,"Radhika",20,65));
			std.add(new Student(6,"Chanchal",18,82));
			std.add(new Student(4,"koyal",21,72));
			std.add(new Student(10,"Siddhi",29,69));
			std.add(new Student(20,"Ritik",21,84));
			std.add(new Student(11,"Shivam",20,80));
		
			// Creating a List of type marks to add all the marks of students
			List<Float> marks = new ArrayList<Float>();
			
			// For each loop 
			for(Student s: std) {
				
				// adding the elements to marks List according to condition
				if(s.marks>=60 && s.marks<=80)
					marks.add(s.marks);
			}
			
			// Print the marks between 60-80
			System.out.println(marks);
		
		}
		}

