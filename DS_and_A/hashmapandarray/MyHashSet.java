
package DS_and_A.hashmapandarray;
import java.util.ArrayList;

public class MyHashSet {
    private final int bucketSize = 123;
    private ArrayList<Integer>[] buckets;
    private boolean containsNull;

    public MyHashSet() {
        // Initialize buckets array with ArrayList objects
        buckets = new ArrayList[bucketSize];
        for (int i = 0; i < bucketSize; i++) {
            buckets[i] = new ArrayList<>();
        }
        containsNull = false;
    }

    private int hash(int key) {
        return key % bucketSize;
    }

    public void add(Integer key) {
        if (key == null) {
            containsNull = true;
            return;
        }
        int index = hash(key);
        if (!contains(key)) {
            buckets[index].add(key);
        }
    }

    public void remove(Integer key) {
        if (key == null) {
            containsNull = false;
            return;
        }
        int index = hash(key);
        ArrayList<Integer> bucket = buckets[index];
        bucket.remove(key);
    }

    public boolean contains(Integer key) {
        if (key == null) {
            return containsNull;
        }
        int index = hash(key);
        ArrayList<Integer> bucket = buckets[index];
        return bucket.contains(key);
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        System.out.println(myHashSet.contains(1)); // true
        System.out.println(myHashSet.contains(3)); // false
        myHashSet.add(2);
        System.out.println(myHashSet.contains(2)); // true
        myHashSet.remove(2);
        System.out.println(myHashSet.contains(2)); // false

        // Handling null values
        myHashSet.add(null);
        System.out.println(myHashSet.contains(null)); // true
        myHashSet.remove(null);
        System.out.println(myHashSet.contains(null)); // false
    }
}
