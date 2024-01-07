package com;
import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		EmployeeService e=new EmployeeServiceImpl();
		System.out.println("=========Welcome to Employee-DB========");
		while(true) {
			System.out.println("======Menu==========");
			System.out.println("1.Create Employee-Db \n2.Available Index");
			System.out.println("3.Add-Employee \n4.Display All \n5.Get Emp By Eid ");
			System.out.println("6.Delete the Employee Id \n7.Exit");
			System.out.println("Enter Your option:");
			int op=ip.nextInt();
			switch(op) {
			case 1:System.out.println("Enter the size of Db:");
			       int size=ip.nextInt();
			       e.createEmployeeDb(size);
			       break;
			case 2:e.availableIndex();
			       break;
			case 3:System.out.println("Enter the Index number:");
			       int in=ip.nextInt();
			       e.addEmployee(in);
			case 4:e.displayAllEmp();
			       break;
			case 5:System.out.println("Enter the Eid:");
			       int eid=ip.nextInt();
			       e.getEmpByEid(eid);
			       break;
			case 6:System.out.println("Enter the Eid");
			       int eid1=ip.nextInt();
			       e.deleteEmployee(eid1);
			       break;
			       
			case 7:
				System.out.println("Thank you visit again");
				System.exit(0);
				break;
			default:
				System.out.println("invalid option");
				break;
			}
		}
	}

}
