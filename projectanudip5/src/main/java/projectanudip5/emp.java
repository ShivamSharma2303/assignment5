package projectanudip5;




public class emp  implements Comparable<emp> {

	String name;
	int age;
	double salary;
	int id;
	
	emp(int id, String name, int age, double salary){	// Constructor of Employee class
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}
		
		@Override	
		public int compareTo(emp emp) {					// overriding the compareTo method of Comparable class
			if(salary == emp.salary)
				return 0;
			else if(salary > emp.salary)
				return 1;
			else
				return -1;
		}
}