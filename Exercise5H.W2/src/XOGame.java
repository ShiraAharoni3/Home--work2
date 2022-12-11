import java.util.Arrays;
import java.util.Scanner;

public class XOGame
{

    public static void main(String[] args)
    {
        int FullCellCounter = 0 ;
        char[] numArray = new char[9] ;
        char userChoice = 0 ;
        Arrays.fill( numArray, (char) 0);
        System.out.println(Arrays.toString(numArray));
        int j = 0 ;
        char Player1 = '0' ;
        char Player2 = 'X' ;
        int playerTurn = 0 ;
        while( true )
        {
            printBoard(numArray);
            Scanner scanner = new Scanner(System.in);
            int locationOfBoard = 0;

            System.out.printf("player of %c Please enter your position : " , playerTurn == 0 ? '0' : 'X' );
            locationOfBoard = scanner.nextInt();

            userChoice = playerTurn == 0 ? '0' : 'X' ;
//            System.out.print(" Please enter your choice( 0/X : )");
//            userChoice = scanner.next().charAt(0);

            if( checkUserChoice ( locationOfBoard , userChoice , numArray) == 0 )
            {
                playerTurn = ( playerTurn == 0 ) ? 1 : 0 ;
                FullCellCounter++ ;
                int gameResult = checkIfGameIsOver ( numArray , '0' , FullCellCounter )  ;
                if ( gameResult == -2 )
                {
                    System.out.print("Game is Over there is no winner \n");
                    break;
                }
                if( gameResult == 0 )
                {
                    System.out.print("Game is Over the player of 0 win \n");
                    break;
                }
                else if( checkIfGameIsOver ( numArray , 'X' , FullCellCounter ) == 0 )
                {
                    System.out.print("Game is Over the player of X win \n");
                    break;
                }
            }
        }
        printBoard(numArray);
    }
    public static int printBoard( char[] numArray)
    {
        for( int i = 0  ; i < 9 ; i++ )
        {
            if ( (i+ 1) % 3 == 0)
            {
                System.out.print(  numArray[i]  + " \n");
            }
            else
            {
                System.out.print(   numArray[i] +" " + "|" + " ");
            }
        }
        return 0 ;
    }

    public static int checkUserChoice (int location , char choice ,char[] array)
    {
        int res = -1 ;

        if ( location < 0 || location > 8)
        {
            System.out.println( " Error! location is out of range ");
            return -1;
        }
        if( ( choice != '0') && ( choice != 'X' ) )
        {
            System.out.println( " Error! choise is not valid  ");
            return -1;

        }
        if ( array [location] == 0 )
        {
            array[location] = choice ;
            return 0 ;
        }
        else
            System.out.println( " Error! location in already used ");

        return res ;
    }

    public static int checkIfGameIsOver ( char[] array , char choice , int counter )
    {
        int res = -1 ;
        for( int k = 0 ; k < 3 ; k++ )
        {
            if( ( array[k*3] == choice ) &&  ( array[k*3+1] == choice ) && ( array[k*3+2] == choice ) )
            {
                res = 0 ;
                break ;
            }
            if( ( array[k] == choice ) &&  ( array[k+3] == choice ) && ( array[k+6] == choice ) )
            {
                res = 0 ;
                break ;
            }

        }
        if( res == 0 )
            return 0 ;

        if(     ( array[0] == choice ) &&  ( array[4] == choice ) && ( array[8] == choice )  ||
                ( array[2] == choice ) &&  ( array[4] == choice ) && ( array[6] == choice )     )
        {
            return 0 ;
        }

        if( counter == 9 )
        {
            return -2 ;
        }
        return res ;

    }


}