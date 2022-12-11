import java.util.Arrays;
import java.util.Scanner;

public class UpDownArray {
    public static void main(String[] args) {
        int[] upDownArray = new int[4];
        int sum = 0;
        int number = 0;
        int i;
        for (i = 0; i < upDownArray.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number : ");
            number = scanner.nextInt();
            upDownArray[i] = number;
        }

        System.out.println(Arrays.toString(upDownArray));
        String num = String.valueOf(upDownArray);
        int check = 0;
        int startDown = 0 ;

        for (int j = 0; j < upDownArray.length-1; j++)
        {
            if (upDownArray[j] > upDownArray[j + 1])
            {
                startDown = check = j;
                break;
            }

        }
        if ( ( check != 0 ) && ( check != 3 ) )
        {
            for (int l = check; l < upDownArray.length-1; l++)
            {
                if ( upDownArray[l+1] > upDownArray[l])
                {
                    check = 0 ;
                    break;
                }
                //System.out.println(" 1 ");
            }
            if( check != 0 )
                System.out.printf(" array start down %d\n" , startDown );


        }
    }
}