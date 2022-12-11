import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int[] randomArray1 = new int[4];
        int[] randomArray2 = new int[4];
        int t = 0;
        int j = 0;
        int i = 0;
        boolean validNumber = false ;
        int randomNumber = 0;

        while (validNumber == false) {

            Random random = new Random();
            int min = 1000;
            int max = 6666;
            int b1 = (int) (Math.random() * (max - min + 1) + min);
            randomNumber = b1;
            int rightDigit = 0;
            System.out.println("Random Integers: " + b1);
            boolean res = true ;
            randomArray1[0] = randomArray1[1] = randomArray1[2] = randomArray1[3] = 0;

            for (i = 0; i < randomArray1.length; i++) {
                rightDigit = b1 % 10;
                if ( isDigitValu( rightDigit , randomArray1 ) == true) {
                    randomArray1[ randomArray1.length - 1 -i ]  = rightDigit;
                    b1 = b1 / 10;
                }
                else
                {
                    res = false;
                    break;
                }
            }
            if( res == true )
                break ;
        }
        System.out.println(Arrays.toString(randomArray1));
        int index = 0;
        int result = 1;
        for (j = 0; j < randomArray1.length; j++) {
            result = 1;
            for (t = 0; t < index; t++) ;
        }
        guessesPlayer(randomNumber, randomArray1);
    }



    public static int guessesPlayer(int b, int[] randomArray1) {
        int [] retriesArray = { 20 , 15 , 10 , 0 } ;
        System.out.print(" Hello welcome to the game , before we start please choose level :\n");
        System.out.print(" To Easy level - (20 guesses) enter 0 \n");
        System.out.print(" To Medium level - (15 guesses) enter 1 \n");
        System.out.print(" To Hard level - (10 guesses) enter 2 \n");
        System.out.print(" To Surprise level - (between 5 to 25 guesses) enter 3 \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your level : ");
        int level = scanner.nextInt();
        int retriesCounter = 0;
        int userChosenRetries = 0;
        int bool = 0;
        int pgia = 0;
        int userNumber = 0;
        if( level == 4 )
            userChosenRetries = 5 ;
        else
            userChosenRetries = retriesArray[level];
        while (retriesCounter < userChosenRetries) {
            boolean res = false;
            System.out.print("enter number with 4 digits :");
            userNumber = scanner.nextInt();
            int[] userNumArray = new int[4];
            int tmp = userNumber ;
            for (int i = 0; i < userNumArray.length; i++) {
                userNumArray[userNumArray.length - i -1 ] = tmp % 10;
                tmp = tmp / 10;
            }
            if (userNumber == b)
            {
                res = true;
                System.out.printf("you win to guess %d : \n" , b );
                break;
            }
            bool = pgia = 0 ;
            for ( int j = 0; j < 4; j++)
            {
                if (userNumArray[j] == randomArray1[j]) {
                    bool++;
                } else {
                    for (int k = 0; k < 4; k++) {
                        if (userNumArray[j] == randomArray1[k]) {
                            pgia++;
                        }
                    }
                }
            }
            System.out.printf("bool %d  pgia %d: \n" , bool , pgia );
/*
            int guess = 0;
            while (guess != b) {
                for (int l = 0; l < 20; l++) {

                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Enter your guess");
                    guess = scanner.nextInt();
                    int[] guessArray = new int[4];
                    for (int i = 0; i < guessArray.length; i++) {
                        guessArray[i] = b % 10;
                        b = b / 10;
                    }
                    //   System.out.println(guessArray.equals(b.toString()));


                }
*/

        }
        return 0;

    }
    public static boolean isDigitValu( int digit , int [] array )
    {
        boolean res = true;
        if (digit != 7 && digit != 8 && digit != 9 && digit != 0)
        {
            for( int k = 0 ; k < 4 ; k++  )
            {
                if ( array[k] == digit )
                {
                   res = false;
                }
            }
            return res;
        }

        return false;
    }
}
