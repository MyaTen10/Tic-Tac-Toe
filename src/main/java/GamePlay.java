import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GamePlay {
    static boolean round = true;
    static ArrayList<Integer>playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer>computerPositions = new ArrayList<Integer>();
   static HumanPlayer user = new HumanPlayer();
  static ComputerPlayer cpumove = new ComputerPlayer();

   public void playGame() {
        // The game board including spaces and lines
        System.out.println("Let the game begin");
        char Board[][] = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        printBoard(Board);
        //loop game
        while (round) {
            //prompt users input and move
        user.HumanPlayer();
        while (playerPositions.contains(user.playermove)|| computerPositions.contains(user.playermove)){
            System.out.println("Position taken. Try another position");
        user.HumanPlayer();}
        //check winner after player plays
            String result = checkWinner();
            if(result.equals(" ")){
                System.out.println(result);
                break;}
            boardPiece(Board, user.playermove, cpumove.computermove,user.name);
            cpumove.ComputerPlayer();
            while (playerPositions.contains(cpumove.computermove)|| computerPositions.contains(cpumove.computermove)){

            cpumove.ComputerPlayer();}
            //print board and 'x' or 'o'
            boardPiece(Board, user.playermove, cpumove.computermove,user.name);
            printBoard(Board);
            //check winner after computer plays
            result = checkWinner();
            if(result.equals(" ")){
            System.out.println(result);
            break;}


        }
       round =false;
    }

        public static void printBoard ( char[][] Board){
            for (char[] row : Board) {
                for (char symbol : row) {
                    System.out.print(symbol);
                }
                System.out.println();
            }
        }

        public static void boardPiece ( char[][] Board,  int playermove, int computermove, String name){

        playerPositions.add(user.playermove);
        computerPositions.add(cpumove.computermove);
            switch (user.playermove) {
                case 1:
                    Board[0][0] = 'X';
                    break;
                case 2:
                    Board[0][2] = 'X';
                    break;
                case 3:
                    Board[0][4] = 'X';
                    break;
                case 4:
                    Board[2][0] = 'X';
                    break;
                case 5:
                    Board[2][2] = 'X';
                    break;
                case 6:
                    Board[2][4] = 'X';
                    break;
                case 7:
                    Board[4][0] = 'X';
                    break;
                case 8:
                    Board[4][2] = 'X';
                    break;
                case 9:
                    Board[4][4] = 'X';
                    break;
                default:
                    break;
            }
            switch (cpumove.computermove) {
                case 1:
                    Board[0][0] = 'O';
                    break;
                case 2:
                    Board[0][2] = 'O';
                    break;
                case 3:
                    Board[0][4] = 'O';
                    break;
                case 4:
                    Board[2][0] = 'O';
                    break;
                case 5:
                    Board[2][2] = 'O';
                    break;
                case 6:
                    Board[2][4] = 'O';
                    break;
                case 7:
                    Board[4][0] = 'O';
                    break;
                case 8:
                    Board[4][2] = 'O';
                    break;
                case 9:
                    Board[4][4] = 'O';
                    break;
                default:
                    break;
            }
        }
        public static String checkWinner(){
            List topRow = Arrays.asList(1,2,3);
            List midRow = Arrays.asList(4,5,6);
            List botRow = Arrays.asList(7,8,9);
            List leftCol= Arrays.asList(1,4,7);
            List midCol = Arrays.asList(2,5,8);
            List rightCol = Arrays.asList(3,6,9);
            List leftcross = Arrays.asList(1,5,9);
            List rightcross = Arrays.asList(3,5,7);

            List<List>winning = new  ArrayList<List>();
            winning.add(topRow);
            winning.add(midRow);
            winning.add(botRow);
            winning.add(leftCol);
            winning.add(midCol);
            winning.add(rightCol);
            winning.add(leftcross);
            winning.add(rightcross);

            for (List l: winning){
                if(playerPositions.containsAll(l)){
                    round = false;
                    return "You won!";
                }else if (computerPositions.containsAll(l)){
                    round = false;
                    return "computer won";
                }else if (playerPositions.size() + computerPositions.size() == 9);
                {
                    return "Its a tie";
                }
            }


        return " ";
        }
    }


