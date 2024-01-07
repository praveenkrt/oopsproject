 package com11;

public class Employee {
	private int id;
	private String name;
	private double sal;
	private String design;
	public Employee(int id, String name, double sal, String design) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.design = design;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	@Override
	public String toString() {
		
		return id+name+sal+design;
	}
	
	
}
