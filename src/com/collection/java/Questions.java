package com.collection.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Questions {
	
	
	//based on values-- > return keys -->
	public static HashMap<String,List<Employee>> getCompanyBasedOnEmpName(
			HashMap<String,List<Employee>> hmap1,
			String empName) {
		
		HashMap<String,List<Employee>> resultList = new HashMap<String,List<Employee>>();
		
//		TreeSet<E>
		
		Set<Entry<String,List<Employee>>> setOfEntries = hmap1.entrySet();
		
		Iterator<Entry<String,List<Employee>>> setIter = setOfEntries.iterator();
		
		while(setIter.hasNext()) {
			
			List<Employee> companyEmpList = new ArrayList<Employee>();	// je je names match hota-->company
			
			Entry<String,List<Employee>> entry = setIter.next();
			List<Employee> emps = entry.getValue();	//all emps from that company
			for (Employee employee : emps) {
				if(employee.getEmpName().equals(empName)) {
					companyEmpList.add(employee);
				}
			}
			resultList.put(entry.getKey(),companyEmpList);
		}
		
		return resultList;
	}
	
	public static void main(String[] args) {
		
				//key-->emp
				//value-->string
		HashMap<Employee,String> hmap = new HashMap<Employee, String>();
		hmap.put(new Employee(101,"xx1f2",43902.2),"A1");
		hmap.put(new Employee(1201,"t1f2",42902.2),"A2");
		hmap.put(new Employee(1031,"aa1f2",14902.2),"A3");
		hmap.put(new Employee(1401,"sf1f2",3902.2),"A4");
		hmap.put(new Employee(1601,"V1f2",2302.2),"A4");
		hmap.put(new Employee(5101,"g1f2",4102.2),"A5");
		
		//System.out.println(hmap);
		//find out all emps whose salary is greater than 10k
		Collection<String> ansvalues =hmap.values();
		Iterator<String> ansIter = ansvalues.iterator();
		while(ansIter.hasNext()) {
			String val = ansIter.next();
			//System.out.println(val); // only values-->
		}
		
		//System.exit(0);
		//key--string
				//value -> List<Employee>
		HashMap<String,List<Employee>> hmap1 = new HashMap<String,List<Employee>>();
		List<Employee> emplist1 = new ArrayList<Employee>();
		emplist1.add(new Employee(101,"XXXX", 1290.23));
		emplist1.add(new Employee(102,"tXX", 3290.23));
		emplist1.add(new Employee(103,"yXXX", 14290.23));
		
		List<Employee> emplist2 = new ArrayList<Employee>();
		emplist2.add(new Employee(1021,"XXXX", 1290.23));
		emplist2.add(new Employee(1301,"qXXXX", 11290.23));
		emplist2.add(new Employee(1402,"tXX", 3290.23));
		emplist2.add(new Employee(1053,"yvXXX", 124290.23));
		
		List<Employee> emplist3 = new ArrayList<Employee>();
		emplist3.add(new Employee(1011,"5XXXX", 15290.23));
		emplist3.add(new Employee(1202,"4tXX", 34290.23));
		emplist3.add(new Employee(1043,"3yXXX", 34290.23));
		emplist3.add(new Employee(1301,"XXXX", 15290.23));
		emplist3.add(new Employee(1012,"t2XX", 32490.23));
		emplist3.add(new Employee(1013,"y3XXX", 14290.23));
		
		hmap1.put("INFY",emplist1);
		hmap1.put("TCS",emplist2);
		hmap1.put("COGNI",emplist3);
		// find out emps--> with company name --.whose salary is > amnt
		
		
		HashMap<String,List<Employee>> hh = getCompanyBasedOnEmpName(hmap1,"XXXX");
		System.out.println(hh);
		
	System.exit(0);
		
		Set<String> companyNames = hmap1.keySet();
		Iterator<String> compIter = companyNames.iterator();
		while(compIter.hasNext()) {
			String company = compIter.next();
			if(company.equals("INFY") || company.equals("TCS")) {
				System.out.println("-------------"+company +"----------------");
				List<Employee> emps = hmap1.get(company);
				System.out.println(emps);
			}
		}
		
		System.exit(0);
		
		//keys --> immutable --> hash--> consistent--> 
		
		/*
		 * setOfEntries = hmap1.entrySet(); setIter = setOfEntries.iterator();
		 * while(setIter.hasNext()) { Entry<String,List<Employee>> entry =
		 * setIter.next();
		 * 
		 * System.out.println("CompanyName : "+entry.getKey() ); List<Employee> emps =
		 * entry.getValue(); for (Employee employee : emps) {
		 * if(employee.getEmpSalary()>20000) {
		 * System.out.println(" : Emp Data : "+employee); }
		 * 
		 * } System.out.println("-------------------------------------------------"); }
		 * 
		 * System.exit(0);
		 * 
		 * //find out same name employees--> irrespective of the company..
		 * //List<Employee> Collection<List<Employee>> allempdata = hmap1.values();
		 * //List<Employee>
		 * 
		 * List<Employee> allemps = new ArrayList<Employee>(); Iterator<List<Employee>>
		 * alldataIter = allempdata.iterator(); while(alldataIter.hasNext()) {
		 * //List<Employee> List<Employee> emps = alldataIter.next();
		 * allemps.addAll(emps); }
		 * 
		 * 
		 * //System.out.println(allemps);
		 * 
		 * Set<String> uniqueEmpNames = new HashSet<String>(); for (Employee employee :
		 * allemps) { boolean flag = uniqueEmpNames.add(employee.getEmpName());
		 * if(flag==false) { System.out.println(employee); } }
		 * 
		 * 
		 * System.exit(0);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * ArrayList<Employee> employees = new ArrayList<Employee>(); employees.add(new
		 * Employee(101,"1f2",4902.2)); employees.add(new
		 * Employee(1021,"c1323",52902.2)); employees.add(new
		 * Employee(4101,"X123X",902.2)); employees.add(new
		 * Employee(1501,"asdXX",72902.2)); employees.add(new
		 * Employee(1671,"31XX",102.2));
		 * 
		 * 
		 * System.out.println(employees);
		 * 
		 * Collections.sort(employees,new SalarySort());
		 * System.out.println("After sort..");
		 * 
		 * 
		 * System.out.println(employees); //comparator using -->annonymous class
		 * implementation--> Comparator<Employee> idSort = new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) { return o1.getEmpId()
		 * - o2.getEmpId(); }
		 * 
		 * };
		 * 
		 * Collections.sort(employees,idSort); System.out.println("After sort..");
		 * System.out.println(employees);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.exit(0); List<Integer> vals =
		 * Arrays.asList(12,23,12,431,2,13,131,13,123); CopyOnWriteArrayList<Integer>
		 * values = new CopyOnWriteArrayList<Integer>(vals); ListIterator<Integer>
		 * valIter = values.listIterator(); while(valIter.hasNext()) { Integer num =
		 * valIter.next(); if(num==13) { values.remove(new Integer(13)); }
		 * System.out.println(num); }
		 */
		
	//ArrayList --> FailFast	
	// CopyOnWriteArrayList --> FailSafe -->

	//whichever class --> fails--> at the time of iterating --> modify--> FAIL FAST
				//OPP --> FAIL SAFE..
	// ALL CLASSES -> CAME INSIDE --> JAVA 1.5--> CONCURRENT PACKAGE MADHE --> BYDEFAULT -- > FAIL SAFE..
	//HASHTABLE --> ENUMERATOR --> FAIL SAFE ASTO..
		
	}
}


class SalarySort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getEmpSalary()  - o2.getEmpSalary());
	}
	
}

class Employee{
	private int empId;
	private String empName;
	private double empSalary;
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
}
