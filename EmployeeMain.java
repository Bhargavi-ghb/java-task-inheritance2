package com.inheritance;

class Employee{
	String name;
	double baseSalary;
	public void calculateAnnualSalary(){
		baseSalary=baseSalary*12;
		System.out.println(baseSalary);
	}	
}

class Manager extends Employee{
	
	double bonus;
	int numberOfEmployeesManaged;
	
	public Manager(String name, double baseSalary,double bonus,int numberOfEmployeesManaged) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.bonus=bonus;
		this.numberOfEmployeesManaged=numberOfEmployeesManaged;
	}
	
	public double calculateManagerSalary(){
			return (baseSalary+bonus);
	}
}

class Engineer extends Employee{
	int projectCount;
	double annualSalary;
	double bonusProject=1000;
	
	
	public Engineer(String name, double baseSalary,int projectCount) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public double calculateEngineerSalary() {
		return baseSalary+(projectCount*bonusProject);
	}
}

class SalesPerson extends Employee{  	
	double comissionRate;  	
	int totalSales; 
	public SalesPerson(String name,double baseSalary,double comissionRate,int totalSales) { 
	 	this.name=name; 
	 	this.baseSalary=baseSalary;  	 	
	 	this.comissionRate=comissionRate;  	 	
	 	this.totalSales=totalSales; 
	} 
	public double calculateSalespersonSalary() {  	 	
		return baseSalary+(comissionRate*totalSales); 
	} 
} 

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee manager=new Manager("Alice",50000,10000,5);
		manager.calculateAnnualSalary();
		System.out.println(((Manager)manager).calculateManagerSalary());;
	
		Employee engineer=new Engineer("Bob",70000,5);
		engineer.calculateAnnualSalary();
		System.out.println((( Engineer)engineer).calculateEngineerSalary());;
		
		Employee salesPerson=new SalesPerson("Charlie", 40000, 0.1, 20000); 
		salesPerson.calculateAnnualSalary();
 	 	System.out.println(((SalesPerson)salesPerson).calculateSalespersonSalary()); 

	}

}

