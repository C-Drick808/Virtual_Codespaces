package CedrickProgram.Java_Tesda;

import java.util.Scanner;

/**
 * OddOrEvenWithPOSNEGZER_Task
 */
public class OddOrEvenWithPOSNEGZER_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int inputNum = scanner.nextInt();
        String oddOrEven = inputNum%2 == 0?"is Even":"is Odd";
        scanner.close();
        if (inputNum > 0) 
            System.out.println("The number of "+inputNum+" "+oddOrEven+" And "+"Positive Number");
        else if(inputNum == 0)
            System.out.println("The number of "+inputNum+" "+oddOrEven+" And "+"Zero Number");
        else
            System.out.println("The number of "+inputNum+" "+oddOrEven+" And "+"Negative Number");
    }
}