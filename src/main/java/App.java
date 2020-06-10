import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        boolean continueGame = true;

        Scanner input = new Scanner(System.in);
        GamePlay newGame = new GamePlay();
        newGame.playGame();

        while (continueGame) {
            //this is where the user chooses between starting the game again or not
            System.out.println("Do you want to play again:\ntype Yes for yes\ntype No for no");
            String choice = input.nextLine();
            if (choice.equals("Yes") || choice.equals("yes")) {
                newGame.playGame();
            }
             else if (choice.equals("No") || choice.equals("no")) {
                continueGame = false;
                System.out.println("See you next time");
            }
        }

    }
}
