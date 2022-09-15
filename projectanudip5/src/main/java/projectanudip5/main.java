package projectanudip5;

import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<emp> emp = new ArrayList<emp>();					// creating ArrayList of type Employee
		// Adding elements to ArrayList
		emp.add(new emp(302,"Madhu",39,50000));							
		emp.add(new emp(116,"Koyal",51,75000));
		emp.add(new emp(226,"Narayan",31,30000));
		emp.add(new emp(105,"Vanshika",22,90000));
		emp.add(new emp(122,"Nitu",33,200800));
		emp.add(new emp(421,"Kialash",34,56000));
		emp.add(new emp(429,"Deepu",26,30000));
		
		
		// Using the Override method compareTo of Comparable class
		Collections.sort(emp);
		
		// Print using for each loop
		for(emp e: emp) {													
			System.out.println(e.id+"\t"+ e.name+"\t"+e.age+"\t"+e.salary);
		}
	}
	}