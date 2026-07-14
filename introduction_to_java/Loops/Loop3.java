import java.util.Random;
import java.util.Scanner;

public class Loop3 {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   Random rn = new Random();
   int randomNumber= rn.nextInt(10)+1;
   int guessedNumber;

   //System.out.println(randomNumber);
   
   do
   {
    System.out.println("Enter number between 1 to 10");
    guessedNumber = s.nextInt(); 
    
    if(guessedNumber==randomNumber)
    {
        System.out.println("Congrats you guessed " + randomNumber + " correctly");
    }
    else 
    {
        System.out.println("try again");
    }
   }
   while(guessedNumber!=randomNumber);

  s.close();
  }
}
