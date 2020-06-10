import java.util.Scanner;

public class HumanPlayer {
    Scanner input = new Scanner(System.in);
    public String name;
    public int playermove;

    public void HumanPlayer(){
        System.out.println("Hello what is your name?");
        name = input.nextLine();
        System.out.println("Hey " + name + " what is your move 1-9?");

        playermove = input.nextInt();
    }
}
