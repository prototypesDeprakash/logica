
public class FinClass {
    
   final class Game {
        void disp(){
            System.out.println("I like games");
        }
    }

    class GameName extends Game { //error will occcur because we cannot extend final method
      
        void disp(){
            System.out.println("I like Ghost of Tsushima");
        }
    }

    public static void main(String[] args) {
        // Create an instance of GameName
        FinClass finClass = new FinClass();
        FinClass.GameName gameName = finClass.new GameName();
        gameName.disp(); // Output: I like Ghost of Tsushima
    }
}
