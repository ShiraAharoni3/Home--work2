import java.util.Scanner;

public class PhoneNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number :");
        String PhoneNumber = scanner.next();
        //String numberPhone = String.valueOf(number);
        int numberLength = PhoneNumber.length();
        System.out.println("numberSize " + numberLength);
        // int numberValue = numberPhone.contains( 050 );
        boolean res;
        int x = PhoneNumber.length();
        if ((PhoneNumber.length() != 10) && (PhoneNumber.length() != 11) && (PhoneNumber.length() != 12))
        {
            System.out.println("you have entered wrong phone Number ( length ) ");
            return;
        }
        else {

                char[] stringArray = PhoneNumber.toCharArray();
                char[] tmpArray = new char[11];
                res = true;
                //for ( int i = 0 ; i <= numberLength ; i++)
                if (numberLength == 10) {
                    if ( stringArray[0] != '0' && stringArray[1] != '5' && stringArray[2] != '0')
                    {
                        return;
                    } else {
                        tmpArray[0] = stringArray[0];
                        tmpArray[1] = stringArray[1];
                        tmpArray[2] = stringArray[2];
                        tmpArray[3] = '-';


                        res = true;
                        for (int j = 3; j < 10 ; j++)
                        {

                            if (stringArray[j] < '0' || stringArray[j] > '9')
                            {
                                res = false;
                                break;
                            }
                            tmpArray[j+1] = stringArray[j];
                            System.out.printf("%c ", tmpArray[j]);


                        }
//                        return;
                    }


                }
                else if (numberLength == 11)
                {
                    if (stringArray[0] != '0' && stringArray[1] != '5' && stringArray[2] != '0' && stringArray[3] != '-')
                    {
                        return;
                    }
                    else
                    {

                        for (int j = 4; j < 11; j++)
                        {
                            if (stringArray[j] < 0 || stringArray[j] > 9)
                            {
                                return;

                            }
                            System.out.printf("%c ", stringArray[j]);
                        }

                    }

                }
                else  // if we reach here length is 12
                {
                    if (stringArray[0] != '9' && stringArray[1] != '7' && stringArray[2] != '2' && stringArray[3] != '5' && stringArray[4] != '0') {

                        return;
                    }
                    else
                    {
                        tmpArray[0] = '0';
                        tmpArray[1] = stringArray[3];
                        tmpArray[2] = stringArray[4];
                        tmpArray[3] = '-';


                        res = true;
                        for (int j = 5; j < 12; j++)
                        {

                            if (stringArray[j] < '0' || stringArray[j] > '9')
                            {
                                res = false;
                                break;
                            }
                            tmpArray[j-1] = stringArray[j];
                            System.out.printf("%c ", tmpArray[j-1]);

                        }

                    }

                }
                if( res == true ) {
                    //tmpArray.toString()
                    System.out.printf("\n");
                    for( int n = 0 ; n < 11 ; n++ )
                        System.out.printf("%c ", tmpArray[n]);
                    System.out.printf("\n");
                }


        }

    }
}