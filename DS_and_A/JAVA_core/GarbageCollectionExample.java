

public class GarbageCollectionExample {

    public static void main(String[] args) {
        // Creating objects
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();
        GarbageCollectionExample obj3 = new GarbageCollectionExample();

        // Assigning obj2 to obj1 (obj1 becomes eligible for garbage collection)
        obj1 = obj2;

        // Nullifying obj2 to make it eligible for garbage collection
        obj2 = null;

        // Requesting garbage collector to run
        System.gc();

        // Printing message
        System.out.println("Garbage Collection Example");
    }

    // Overriding finalize method to confirm if object is garbage collected

    protected void finalize() throws Throwable {
        System.out.println("Object garbage collected.");
    }
}
