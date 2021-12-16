package com.demo.logicalprograms.java;

/**
 * Sushant
 */
public class Encapsulation {
	
	private String emp_com;
	private int emp_id;
	private String emp_name;
	
	

	public Encapsulation(String emp_com, int emp_id, String emp_name) {
		super();
		this.emp_com = emp_com;
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}



	public Encapsulation() {
		super();
		// TODO Auto-generated constructor stub
	}






	@Override
	public String toString() {
		return "Encapsulation [emp_com=" + emp_com + ", emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}



	public String getEmp_com() {
		return emp_com;
	}



	public void setEmp_com(String emp_com) {
		this.emp_com = emp_com;
	}



	public int getEmp_id() {
		return emp_id;
	}



	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}



	public String getEmp_name() {
		return emp_name;
	}



	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Employee");
		
		

	}

}
