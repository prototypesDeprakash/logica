package javaoops.studentmanagement;

import java.util.Scanner;

class Studnet{
 private int rollNo;
    private String name;
    private String department;
    private double marks;

    Studnet(int rollNo, String name , String department, double marks){
        this.rollNo= rollNo;
        this.name = name;
        this.department= department;
        this.marks= marks;
    }

    public double getMarks(){
        return marks;
    }
    public String getDepartment(){
        return department;
    }

    public String getName(){
        return name;
    }
}

class College{
    
private String collegeName;
private Studnet[] students;
private int numStudents;

College(String collegeName , Studnet[] students , int numStudents){
    this.collegeName = collegeName;
    this.students = students;
    this.numStudents = numStudents;
} 
public double getAverageMarks(){
    double total= 0;
    double c=0;
    for(Studnet students : students){
        total+=students.getMarks();
        c++;
    }
    return total/c;
}

public Studnet getTopper(){
    double currentmark=Double.MIN_VALUE;
    
    for(Studnet students : students){
        if(students.getMarks()>currentmark){
            currentmark=students.getMarks();
        }
    }
    for(Studnet students : students){
        if(students.getMarks() == currentmark){
            return students;
        }
    }
   return null;
}
public Studnet[] getStudentsByDepartment(String department){

int count=0;
for(Studnet students:students){
if(students.getDepartment().equalsIgnoreCase(department)){
    count++;
    }
    }
Studnet[] res = new Studnet[count];
int i=0;
for(Studnet students:students){
if(students.getDepartment().equalsIgnoreCase(department)){
    res[i]=students;
    i++;
    }
}

return res;
}
public int countPassedStudents(){
    int c =0;
    for (Studnet students : students){
        if(students.getMarks()>=40){
            c++;
        }
    }
    return c;
}


}


public class Answer {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String collegeName = sc.nextLine();
    int numOfstudnets = sc.nextInt();

    Studnet[] students = new Studnet[numOfstudnets];
    for( int i=0 ;i<numOfstudnets;i++){
        int rollNo = sc.nextInt();
        
        String name = sc.nextLine();
        String department = sc.nextLine();
        double marks = sc.nextDouble();
        students[i]=new Studnet(rollNo, name, department, marks);
    }
    College c = new College(collegeName, students, numOfstudnets);
    System.out.println(c.getAverageMarks());
    Studnet topper = c.getTopper();
    System.out.println(topper.getName());
    System.out.println(c.countPassedStudents());
    sc.nextLine();
    String dep  = sc.nextLine();
    for(Studnet s : c.getStudentsByDepartment(dep)){
        System.out.println(s.getName());
    }
   }
}
