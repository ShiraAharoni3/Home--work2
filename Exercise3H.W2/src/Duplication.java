import java.util.Arrays;
import java.util.Scanner;

public class Duplication
{
    public static void main(String[] args)
    {
        int[] numbersArray1 = new int[6];
        int[] numbersArray2 = new int[6];
        int sum = 0;
        int number = 0;
        int i;
        for (i = 0; i < numbersArray1.length; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number : ");
            number = scanner.nextInt();
            numbersArray1[i] = number;
        }

        System.out.println(Arrays.toString(numbersArray1));
        int index = 0;
        int result = 1;
        for (int j = 0; j < numbersArray1.length; j++)
        {
            result = 1;
            for (int t = 0; t < index; t++)
            {
                if (numbersArray2[t] == numbersArray1[j])
                {
                    result = 0;
                    // numbersArray.indexOf(numbersArray[j] == numbersArray[t]);
                    // System.out.println("Error");
                    break;
                }
            }
            if (result == 1)
            {
                numbersArray2[index] = numbersArray1[j];
                index++;
            }

        }

        int []cleanArray = new int[index] ;
        for( i = 0 ; i < index ; i++ )
        {
            cleanArray[i] = numbersArray2[i] ;
//            System.out.printf("%d ", numbersArray2[i]);
        }
//        System.out.println();
        System.out.println(Arrays.toString(cleanArray));
    }

}

