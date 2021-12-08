import java.util.Scanner;

public class main {
     public static void main(String[] args) {
            boolean correct_num = false;
            Scanner reader = new Scanner(System.in);

             System.out.println("Choose the minimum range");
             int min_num = reader.nextInt();
             System.out.println("Choose the maximum range");
             int max_num = reader.nextInt();

             if (max_num < min_num) {
                 System.out.println("Does not compute, try again");
                 max_num = reader.nextInt();
             }

            int R = (max_num + min_num)/2;
            int numOfGuesses = 0;

         while (correct_num == false) {
             System.out.println("Is your number " + R + "?");
             System.out.println("   Yes[1]      No[2]");
             int ans = reader.nextInt();
             numOfGuesses++;

             if (ans == 1) {
                 correct_num = true;
             }

             if (ans == 2) {

                 System.out.println("Smaller[3] or Larger[4]");
                 ans = reader.nextInt();


                 if (ans == 3) {
                     max_num = R;
                     R = (R + min_num)/2;
                 }

                 if (ans ==4) {
                     min_num = R;
                     R = (R + max_num)/2;
                 }


             }
         }

         if(numOfGuesses == 1){
             System.out.println("It took 1 guess.");
         }else{
             System.out.println("It took " + numOfGuesses + " guesses.");
         }


    }
}
