import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        int[] numbersArray = new int[10];
        int sum = 0;
        int number = 0;
        int i;
        for (i = 0; i < numbersArray.length; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number : ");
            number = scanner.nextInt();
            numbersArray[i] = number;
            sum += number;
        }
        System.out.printf("The sum is %d \n", sum);
        System.out.printf("The average is %f \n", (float) ((float) sum / numbersArray.length));
        float average = sum / numbersArray.length;
        for (int j = 0; j < numbersArray.length; j++)
        {
            if (numbersArray[j] > average) {
                System.out.println(numbersArray[j]);
            } else {

            }
        }
    }
}