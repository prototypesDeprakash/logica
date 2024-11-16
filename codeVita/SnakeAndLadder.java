import java.util.*;

class Game {
    int Gamestart;
    int Gameend;
    String type;

    public Game(int Gamestart, int Gameend, String type) {
        this.Gamestart = Gamestart;
        this.Gameend = Gameend;
        this.type = type;
    }
}

public class SnakeAndLadder {
    private static boolean solve(List<Integer> dieRolls, Map<Integer, Integer> board, int finalposition) {
        int position = 1;
        for (int roll : dieRolls) {
            if (position + roll <= 100) {
                position += roll;
            }
            while (board.containsKey(position)) {
                position = board.get(position);
            }
        }
        if (board.containsKey(position)) {
            return false;
        }
        return position == finalposition;
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Game> snakesLadders = new ArrayList<>();
        Map<Integer, Integer> board = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int Gamestart = sc.nextInt();
            int Gameend = sc.nextInt();
            String type = (Gamestart > Gameend) ? "Snake" : "Ladder";
            snakesLadders.add(new Game(Gamestart, Gameend, type));
            board.put(Gamestart, Gameend);
        }

        List<Integer> remainingInput = new ArrayList<>();
        while (sc.hasNextInt()) {
            remainingInput.add(sc.nextInt());
        }
        if (remainingInput.isEmpty()) {
            System.out.print("Not reachable");
            return;
        }

        int finalposition = remainingInput.get(remainingInput.size() - 1);
        remainingInput.remove(remainingInput.size() - 1);
        List<Integer> dieRolls = remainingInput;

        if (solve(dieRolls, board, finalposition)) {
            System.out.print("Not affected");
            return;
        }

        for (Game sl : snakesLadders) {
            board.remove(sl.Gamestart);
            int newStart = sl.Gameend;
            int newEnd = sl.Gamestart;
            String newType = sl.type.equals("Snake") ? "Ladder" : "Snake";

            if (newStart == 1 || board.containsKey(newStart)) {
                board.put(sl.Gamestart, sl.Gameend);
                continue;
            }

            board.put(newStart, newEnd);
            if (solve(dieRolls, board, finalposition)) {
                System.out.print(newType + " " + newStart + " " + newEnd);
                return;
            }

            board.remove(newStart);
            board.put(sl.Gamestart, sl.Gameend);
        }

        System.out.print("Not reachable");
    }

    public static void main(String[] args) {
        solve();
    }
}
