package javaoops.courseManager;

import java.util.Scanner;



class Course{

    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public  Course(int courseId,String courseName, String courseAdmin, int quiz, int handson ){
        this.courseId  = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson; 
    }
    //getters
    public int getCourseId(){
        return courseId;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseAdmin(){
        return courseAdmin;
    }
    public int getQuiz(){
        return quiz;
    }
    public int getHandson(){
        return handson;
    }
    //setters
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setCourseAdmin(String courseAdmin){
        this.courseAdmin=courseAdmin;
    }
    public void setQuiz(int quiz){
        this.quiz=quiz;
    }
    public void setHandson(int handson){
        this.handson = handson;
    }

}


class courseProgram{

    public static int findAvgOfQuizByAdmin (Course[] courses, String courseAdmin){
        int avg=0;
        int tot=0;
        int count=0;
        boolean isCourse=false;
        for(Course c: courses){
            if(c.getCourseAdmin().equalsIgnoreCase(courseAdmin)){
                tot+=c.getQuiz();
                count++;
                isCourse=true;
            }
        }
        if(isCourse){
            avg=tot/count;
            return avg;
        }
        return 0;
        
    }

    public static Course[] sortCourseByHandsOn(Course[] courses, int handson){
        int count=0;
       for(Course c : courses){
        if(c.getHandson()<handson){
            count++;
        }
       }
       int i=0;
       
       Course[] all_handson = new Course[count];
       for(Course c : courses){
        if(c.getHandson()<handson){
            all_handson[i]=c;
            i++;
        }
       }

       //bubble sort

       for ( int j=0;j<count-1;j++){

         for(int k =0;k<count-1-j;k++){
            if(all_handson[k].getHandson()>all_handson[k+1].getHandson()){
                Course temp = all_handson[k];
                all_handson[k]=all_handson[k+1];
                all_handson[k+1]=temp;
            }
         }
       }
       if(count==0){
        return null;
       }
       return all_handson;

    }

    public static void main(String[] args) {
        //(int courseId,String courseName, String courseAdmin, int quiz, int handson 
        Scanner sc = new Scanner(System.in);
        int number_of_courses=sc.nextInt();
        Course[] courses = new Course[number_of_courses];
        for(int i=0;i<number_of_courses;i++){
             int courseId= sc.nextInt();
        sc.nextLine();
        String courseName = sc.nextLine();
        String courseAdmin = sc.nextLine();
        int quiz= sc.nextInt();
        int handson= sc.nextInt();
        courses[i]=new Course(courseId, courseName, courseAdmin, quiz, handson);
        }
        sc.nextLine();
        String Admin = sc.nextLine();
        int handson = sc.nextInt();

       if( findAvgOfQuizByAdmin(courses, Admin)==0){
        System.out.println("No Course found");
       }else{
        System.out.println( findAvgOfQuizByAdmin(courses, Admin));
       }
       if(sortCourseByHandsOn(courses, handson)==null){
        System.out.println("No Course found with mentioned attribute");
       }
       else{
        for(Course c : sortCourseByHandsOn(courses, handson)){
            System.out.println(c.getCourseName());
        }
       }
       
        
       sc.close();
    }
    
}

