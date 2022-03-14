import java.util.Scanner;

public class Factorial {
    public static void main(String [] args) {
   // Declares the variables
    int num;
    long fact = 1;
   // Create the object of Scanner class
   Scanner input = new Scanner(System.in);
   // Accepts the value for the num variable
    System.out.println ("Enter the number for factorial calculation: ");
    num = input.nextInt ();
    do {
        fact =fact * num;
        num--;
    } while (num >= 1);
    System.out.println ("Factorial of a Number: " + fact);
}
}
