

public class OuterClass {
    private static String message = "Hello, World!";

    static class NestedStaticClass {
        void printMessage() {
            System.out.println("Message from nested static class: " + message);
        }
    }

    public static void main(String[] args) {
        OuterClass.NestedStaticClass nested = new OuterClass.NestedStaticClass();
        nested.printMessage();
    }
}
