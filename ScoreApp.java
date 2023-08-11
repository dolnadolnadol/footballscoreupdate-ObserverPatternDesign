import java.util.Scanner;

public class ScoreApp {
    public static void main(String[] args) {
        ScoreSource source = new ScoreSource();

        //class that need to know the score update 1
        ScoreObserver ob1 = new ScoreObserver();

        //class that need to know the score update 2
        ScoreObserver ob2 = new ScoreObserver();

        source.register(ob1);
        source.register(ob2);

        // Thai 1-0 UAE
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score: ");
            String scoreInput = sc.nextLine();
            if (scoreInput.isEmpty()) {
                break;
            }
            source.setData(scoreInput);
        }
        sc.close();
    }
}