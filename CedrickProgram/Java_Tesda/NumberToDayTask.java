package CedrickProgram.Java_Tesda;

import java.util.Scanner;

/**
 * NumberToDayTask
 */
public class NumberToDayTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isWeekDays = true;
        do{
            System.out.print("Enter a number of day: ");
            int numberOfDays = input.nextInt();

            switch (numberOfDays) {
                case 1: 
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5: 
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                case 0:
                    System.out.println("EXIT TO PROGRAM ...");
                    isWeekDays = false;
                    input.close();
                    break;
                
                default:
                    System.out.println("Invalid Input \n Press 0 to exit");
                    break;
            }
        }while(isWeekDays!=false);
    }
}