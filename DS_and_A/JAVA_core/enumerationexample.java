public class enumerationexample {
    public static void main(String[] args) {
        enum day {Sunday , monday , tuesday };
        day today= day.Sunday;
        switch (today) {
            case monday:
                System.out.println("Fuck monday");
                break;
            case tuesday:
                System.out.println("SItty tuesday");
            case Sunday:
                System.out.println("Love sunday");
        
            default:
                break;
        }
    }
}
