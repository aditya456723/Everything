package mortage;

import java.util.Scanner;

public class Simcard {

    private int userinput;

    public void display ( ) {
        Scanner input = new Scanner( System.in );
        System.out.println( "*****Air voice*****" );
        System.out.println( "welcome to air voice enter your input:  \n 1.balance \n 2.validity \n 3.Free calls available \n 4.more \n 5.exit" );
        userinput = input.nextInt( );
    }

    public void switchcase ( ) {
        if (true) {
            switch ( userinput ) {
                case 1:
                    System.out.println( "balance : 500" );
                    break;
                case 2:
                    System.out.println( "validity : 365 days" );
                    break;
                case 3:
                    System.out.println( "2000" );
                    break;
                case 4:

                    while(true) {
                        System.out.println( "more \n 1.prepaid bill request \n 2.customer preferences \n 3.GPRS activation \n 4.back to main menu" );
                        if (true) {
                            Scanner input2 = new Scanner( System.in );
                            int moreoption = input2.nextInt( );
                            switch ( moreoption ) {
                                case 1:
                                    System.out.println( "pay" );
                                    break;
                                case 2:
                                    System.out.println( "preferences" );
                                    break;
                                case 3:
                                    System.out.println( "Activated" );
                                    break;
                                case 4:
                                    return;

                                default:
                                    System.out.println( "enter correct output" );
                                    break;
                            }

                        }
                    }

                case 5:
                    System.exit( 1 );

            }
        }
    }



}