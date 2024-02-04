import java.util.Random;
import java.util.*;

class NumberGame{
    public static void main(String ar[]) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        int start=1;
        int end=100;
        int randnum=rand.nextInt(end-start+1)+start;
        System.out.println("Number Game!");
        System.out.println("Select a number between " +start+ " and " +end);
        int count=0;
        boolean correctguess=false;
        while (!correctguess) {
            System.out.print("Guess the number : ");
            int guess=input.nextInt();
            count++;

            if(guess<start||guess>end){
                System.out.println("Please enter a number between " +start+" and "+end);
            }
            else if(guess>randnum){
                System.out.println("Too big.Try again");
            }
            else if(guess<randnum){
                System.out.println("Too small.Try again");
            }
            else{
                correctguess = true;
                System.out.println("Congrats! You guessed the right number");
                System.out.println("You took "+count+" guesses.");
            }
        }
        input.close();
    }
}