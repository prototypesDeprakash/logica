

class Name<r,n>{
r rollnumber;
n name;
Name(r rollNumber, n name){
    this.rollnumber=rollNumber;
    this.name=name;

}

 void getdata(){
    System.out.println(rollnumber);
    System.out.println(name);
}   

}
public class generics_multiple_param {
    public static void main(String[] args) {
        Name<Integer , String> studentDetail = new Name(1, "Prakash"); 
        Name<Integer , String> studentDetai2 = new Name(2, "raj"); 
        studentDetail.getdata();
        studentDetai2.getdata();

    }
}
