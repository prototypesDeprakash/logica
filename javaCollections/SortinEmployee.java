package javaCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javaCollections.Employee;
public class SortinEmployee{
    

    public static void main(String[] args) {
        List<Employee>myemployee= new ArrayList<Employee>();
        myemployee.add(new Employee(1, "Prakash", 20, 25000));
        myemployee.add(new Employee(2, "Rajesh", 22, 15000));
        myemployee.add(new Employee(3, "kokiKumar", 19, 50000));
        
        System.out.println(myemployee.get(0).getSalary());
      //  Collections.sort(myemployee, new MySort() ); // classic method
        Collections.sort(myemployee, (e1, e2) -> (int) (e1.getSalary() - e2.getSalary())); //lambds method
        System.out.println(myemployee); //sorted in ascending order


    }
    static class MySort implements Comparator<Employee>{
        @Override
        public  int compare(Employee e1 , Employee e2){
            return (int)(e1.getSalary()-e2.getSalary());
        }
    }
}
