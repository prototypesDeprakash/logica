package javaoops.empoyee;

import java.util.Scanner;

import Dailysum.april.tripletsday2;
import subsetAndSubsequence.printallsubset;

class Employee{
    private int id;
    private String name;
    private String designation;
    private double salary;
    
    Employee(int id , String name , String designation , double salary){
        this.id = id;
        this.name = name;
        this.designation= designation;
        this.salary= salary;
    }
    public double getSalary() {
        return salary;
    }
    public String getDesignation() {
        return designation;
    }
}

class Company{
    private String companyName;
    private Employee[]employees;
    private int numEmployee;

    Company(String companyName , Employee[] employees, int numEmployee){
        this.companyName = companyName ;
        this.employees = employees ;
        this.numEmployee= numEmployee;
    }
    public double getAverageSalary(){
         double res;
         double temp=0;
         int tot=0;
         for(Employee emp : employees){
            temp+=emp.getSalary();
            tot++;
         }

        res=temp/tot;
        return res;
    }
    public double getMaxSalary(){
        double maxsal = Double.MIN_VALUE;
        for(Employee emp : employees){
            if(emp.getSalary()>maxsal){
                maxsal= emp.getSalary();
            }
        }
        return maxsal;
    }
    public Employee[] getEmployeesByDesignation(String designation){
        int count =0;
        for (Employee emp : employees){
            if(emp.getDesignation().equals(designation)){
                count++;
            }
        }
        int i=0;
        Employee[]res = new Employee[count];
        for (Employee emp : employees){
            if(emp.getDesignation().equals(designation)){
                res[i]=emp;
                i++;
            }
        }
        return res;
    }
}

public class Answer {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String company_name = sc.nextLine();
        int numofEmp = sc.nextInt();
        Employee[] employees = new Employee[numofEmp];
        for (int i=0;i<numofEmp;i++){
            int id = sc.nextInt();
            String name = sc.nextLine();
            String designation = sc.nextLine();
            double salary = sc.nextDouble();
            
            employees[i]=new Employee(id, name, designation, salary);
        }
        Company c = new Company(company_name, employees, numofEmp);
        System.out.println(c.getAverageSalary());
        System.out.println(c.getMaxSalary());
        
        Employee[] result = c.getEmployeesByDesignation("Manager");

        for (Employee e : result) {
            System.out.println(e.getDesignation() + " " + e.getSalary());
        }
    }
}
