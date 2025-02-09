package javaCollections;

public class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee (int id , String name , int age , int salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String toString(){
        return "Employee[id = " + id +" name = " + name + " age = " +age + "salary = "+salary+" ]";
    }


}
