import java.util.Scanner;

public class IOPractice
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner( System.in );
        
        System.out.print( "What is your name? " );
        String name = keyboard.nextLine();
        System.out.print( "How many pizzas can you eat? " );
        int pizzas = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print( "What is your favorite type? " );
        String fav = keyboard.nextLine();
        System.out.print( name + " ate " + pizzas + fav + " pizzas." );
    }
}