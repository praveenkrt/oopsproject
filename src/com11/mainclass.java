package com11;
import java.util.ArrayList;

public class mainclass {

	public static void main(String[] args) {
		ArrayList<Employee> l1=new ArrayList<Employee>();
		l1.add(new Employee(101,"ramesh",25000.00,"SSE"));
		l1.add(new Employee(102,"suresh",35000.00,"SE"));
		l1.add(new Employee(103,"mukesh",45000.00,"ASE"));
		l1.add(new Employee(104,"mahesh",55000.00,"Intern"));
		System.out.println("------------------------------");
		System.out.println("ID\tname\tsal\tdesign");
		System.out.println("------------------------------");
		for(Object ele:l1) {
			System.out.println(ele);
		}
	}

}
