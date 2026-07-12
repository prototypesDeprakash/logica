import java.util.Scanner;



class Driver{
private int id;
private String name ;
private String contact;
private float expirence;

public Driver(int id, String name , String contact , float expirence){
this.id = id;
this.name = name;
this.contact = contact;
this.expirence= expirence;

}
//getter

public int getId(){return id;}
public String getName(){return name;}
public String getContact(){return contact;}
public float getExpirence(){return expirence;}

//setter
public void setId(int id){this.id= id;}
public void setName(String name){this.name= name;}
public void setContact(String contact){this.contact=contact;}
public void setExpirence(float expirence){this.expirence=expirence;}

}


class Truck{

private int id ;
private String name;
private float totalMilesTraveledByTruck;
private Driver driver;

public Truck(int id, String name , float totalMilesTraveledByTruck,Driver driver){
this.id =id;
this.name = name;
this.totalMilesTraveledByTruck= totalMilesTraveledByTruck;
this.driver= driver;
}
//getter
public Driver getDriver(){
return driver;
}
public int getId(){
return id;

}
public String getName(){
return name;
}
public float getTotalMilesTraveledByTruck(){
return totalMilesTraveledByTruck;
}

//setter

public void setDriver(Driver driver){
this.driver=driver;
}
public void setId(int id){
this.id = id;
}
public void setName(String name){
this.name = name;
}
public void setTotalMilesTraveledByTruck(float totalMilesTraveledByTruck){
this.totalMilesTraveledByTruck= totalMilesTraveledByTruck;
}

}


class Solution{

public static Truck[] getAllTruckWithDistance(Truck[]trucks, int threshold_distance){

int  count =0;
for(Truck t : trucks){
if(t.getTotalMilesTraveledByTruck()>= threshold_distance){count++;}

}
Truck[]res = new Truck[count];
int x=0;
for(Truck t : trucks){
if(t.getTotalMilesTraveledByTruck()>= threshold_distance){
res[x]=t;
x++;
}
}
//sort based on truck drivers expirence
for(int i=0;i<res.length-1;i++){
for(int j =0; j<res.length-i-1;j++){

Truck t = res[j];
if(res[j].getDriver().getExpirence()<res[j+1].getDriver().getExpirence()){
res[j] = res[j+1];
res[j+1]=t;
}

}
}
return res;
}
public static void main(String[]args){


}
}

