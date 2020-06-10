import java.util.Random;

public class ComputerPlayer {

public int computermove;
    public void ComputerPlayer(){
        Random random = new Random();

        computermove = random.nextInt(9)+1;
        System.out.println("Computer has made a move");
    }
}

