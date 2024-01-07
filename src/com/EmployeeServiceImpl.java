package com;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
	Scanner ip=new Scanner(System.in);
	Employee [] eDb;
	
	@Override 
	public void createEmployeeDb(int size) {
		eDb=new Employee[size];
		System.out.println("Employee Db had been created with size:"+size);
	}
	
	@Override
	public void availableIndex() {
		int c=0;
		System.out.println("========Available========");
		for(int i=0; i<eDb.length;i++) {
			if(eDb[i]==null) {
				System.out.println(i+" ");
				c++;
			}
		}
		if(c==0) {
			System.out.println("Database is Full...");
		}
		System.out.println();
	}

	@Override
	public void addEmployee(int in) {
		if(in>=eDb.length) {
			System.out.println("Invalid Index no");
		}
		else if(eDb[in]!=null) {
			System.out.println("Its Already Occupied....!");
		}
		else {
			System.out.println("Enter the Emp id");
			int eid=ip.nextInt();
			System.out.println("Enter the Emp name");
			String name=ip.next();
			System.out.println("Enter the Emp Designation");
			String dsg=ip.next();
			System.out.println("Enter the Emp Salary");
			double sal=ip.nextDouble();
			System.out.println("Enter the Emp Age");
			int age=ip.nextInt();
			eDb[in]=new Employee(eid,name,dsg,sal,age);
			System.out.println("Employee had been added successfully");
			
		}
		
	}

	@Override
	public void displayAllEmp() {
		System.out.println("=======Employee Details====");
		int c=0;
		for(int i=0;i<eDb.length;i++) {
			if(eDb[i]!=null) {
				System.out.println(eDb[i]);
				c++;
			}
		}
		if(c==0) {
			System.out.println("Database is Empty...!");
		}
	}

	@Override
	public void getEmpByEid(int eid) {
		System.out.println("========Employee By Eid========");
		int c=0;
		for(Employee ele:eDb) {
			if(ele!=null) {
				if(ele.getEid()==eid) {
					System.out.println(ele);
					c++;break;
				}
			}
		}
		if(c==0) {
			System.out.println("Employee id not found");
		}
		
	}

	@Override
	public void deleteEmployee(int eid) {
		int c=0;
		for(int i=0;i<eDb.length;i++) {
			if(eDb[i]!=null) {
				if(eDb[i].getEid()==eid) {
					eDb[i]=null;
					System.out.println("Deleted Successfull...");
					c++;
					break;
				}
			}
		}
		if(c==0) {
			System.out.println("Employee id not found");
		}
		
	}
	
	
	
	
}
