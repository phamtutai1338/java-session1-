import java.util.Scanner;

public class Star {
   public static void main (String[] args) { 
       //Declares a variable
   
       int row;
    Scanner input = new Scanner (System.in);
  //Accepts value for the row variable
    System.out.println ("Enter the maximum number of rows for displaying stars: ") ;
        row = input.nextInt ();

    for (int i = 1; i<= row; i++){

        for(int space = row; space >= i; space--){
            System.out.println (" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.println ("*  ");
        }
        System.out.println ();
    } 
    }
  
}
