package DS_and_A.hashmapandarray;

import java.util.ArrayList;

public class hashset {
    public int bucketsize = 123;
    ArrayList <Integer> []buckets;
    boolean ContainsNull=false;

public hashset(){ //constructor to initiate stuffs
buckets =new ArrayList[bucketsize];
for(int i=0;i<bucketsize;i++){
    buckets[i]=new ArrayList<>();
}
ContainsNull=false;
} //end 

private int hash(int key){
    return key%bucketsize;
}


public void add(Integer key){
    if(key==null){
        ContainsNull= true;
        return;
    
    }
    int index = hash(key);
    if(!buckets[index].contains(key)){
    buckets[index].add(key);//adding key in the indexth bucket form a list of bucket

    }
}//end add

public void remove(Integer key){
    if(key==null){
        ContainsNull=false;
        return;
    }
    int index = hash(key);
    if(buckets[index].contains(key)){
        buckets[index].remove(key);
    }
}

public boolean contains (Integer key){
if(key==null){
    return ContainsNull;
}
int index = hash(key);
return buckets[index].contains(key);
}


}
