import java.util.Scanner;

public class Tic_tac_toe {

private Player Player1, Player2;
private Board Board;
private int numPlayer;
public static void main(String [] args)
{
Tic_tac_toe t = new Tic_tac_toe();
t.startGame();
}

public void startGame()
{
    Scanner sc = new Scanner(System.in);
    //take player input
    Player1  = takPlayerInput(sc);
    Player2 = takPlayerInput(sc);
    while (Player1.getSymbol()==Player2.getSymbol()) {
        System.out.println("Enter different symbol :");
        Player2.setSymbol(sc.next().charAt(0));       
    }
    //create the board
     Board = new Board(Player1.getSymbol(),Player2.getSymbol());

    //play the game
    boolean player1turn = true;
    int status = Board.INCOMPLETE;
    while (status == Board.INCOMPLETE|| status ==Board.INVALIDMOVE) {
         if (player1turn) {
          System.out.println("Player 1  - "  + Player1.getName() + "s turn");
          System.out.println("Enter X :");
          int x  = sc.nextInt();
          System.out.println("Enter y  :");
          int y = sc.nextInt();

          status = Board.move(Player1.getSymbol(),x,y);

          if(status ==Board.INVALIDMOVE)
          {
            System.out.println("invalid move try again :");
            continue;
          }
          else 
          {
            player1turn = false;
          }



         }
         else
         {
              
            System.out.println("Player 2  - "  + Player2.getName() + "s turn");
          System.out.println("Enter X :");
          int x  = sc.nextInt();
          System.out.println("Enter y  :");
          int y = sc.nextInt();

          status = Board.move(Player2.getSymbol(),x,y);

          if(status ==Board.INVALIDMOVE)
          {
            System.out.println("invalid move try again :");
            continue;
          }
          else 
          {
            player1turn = true;
          }
         }
         //player1turn =! player1turn;
         Board.print();
    }

   if(status==Board.PLAYER1WIN)
   {
    System.out.println("Player 1 " + Player1.getName() + "win ");
   }
   else if(status == Board.PLAYER2WIN)
   {
    System.err.println("Player 2 " + Player2.getName() + "win");
   }
   else 
   {
    System.out.println("DRAW");
   }
}


private Player takPlayerInput(Scanner sc)
{
  System.out.println("Enter player name :");
  String name = sc.nextLine();
  System.out.println("Enter player symbol :");
  char Symbol = sc.nextLine().charAt(0);
  Player p = new Player(name, Symbol);
  return p;
}
}
