import java.lang.Math;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        int secretNumber=(int) (Math.random()*(100-0+1));  //numbers range is from 0 to 100
        int userGuess=0;
       // guessUnlimited(secretNumber,userGuess);
          guessLimited(secretNumber,userGuess);

    }

    public static void guessUnlimited(int secretNumber,int userGuess)    //for Unlimited number of guesses
    {
        while(true)
        {
            userGuess=takeInput();
            if(userGuess<secretNumber)
            {
                System.out.println("Your number is smaller");
            }
            else if (userGuess>secretNumber)
            {
                System.out.println("Your number is larger");
            }
            else
            {
                System.out.println("You guessed it right");
                return;
            }
        }
    }

    public static void guessLimited(int secretNumber,int userGuess)      //for limited number of guess
    {
        System.out.println("\nYou are playing the game: Guess the Number. \nYou have maximum 5 attempts to guess the correct number. \n");
        for(int i=0;i<5;i++)
        {
            if (i == 4)
            {
                System.out.println("\nWatch out, it's your last turn.");
            }
            userGuess=takeInput();
            if(userGuess<secretNumber)
            {
                System.out.println("Your number is smaller");
            }
            else if (userGuess>secretNumber)
            {
                System.out.println("Your number is larger");
            }
            else
            {
                System.out.println("You guessed it right");
                return;
            }
        }
        System.out.println("You loose");
        System.out.println("Number was: "+secretNumber);
    }

    public static int takeInput()
    {
        Scanner sc=new Scanner(System.in);
        int guess=0;
        System.out.println("Enter a number between 0 to 100 ");
        if(sc.hasNextInt())
        {
            guess= sc.nextInt();
        }
        else
        {
            System.out.println("Enter a valid number between 0 to 100");
        }
        return guess;
    }
}