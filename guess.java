package Guessinggame;
import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args) {
       Random  rand = new Random();
       Scanner sc = new Scanner(System.in);

       System.out.println("Welcome, To Guessing game with none other than your friend your computer");
       System.out.println("Pick any value from 0 to 10");
       int comp = rand.nextInt(0, 11);
       System.out.println("Enter your guessing values: ");
       int user = sc.nextInt();

       System.out.println("Computer values: "+comp+"\nYour vlaue: "+user);

        if (comp == user) {
            System.out.println("Your correct, You win!!!!!!! :)");
        }
        else{
            System.out.println("Your wrong, You lose :(");
        }
    }
}
