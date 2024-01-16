package CedrickProgram.Java_Tesda;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * FindLargestNumber
 */
public class FindLargestNumTask {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayNumber = new ArrayList<Integer>();

        System.out.println("Enter a number: ");
        int 

        int num1 = 23,num2 = 12, num3 = 90;
        arrNumber.add(num1);
        arrNumber.add(num2);
        arrNumber.add(num3);
        
        int maximum = arrNumber.get(0);
        for (int i = 1; i < arrNumber.size(); i++) {
            if (maximum < arrNumber.get(i))
                maximum = arrNumber.get(i);
        }

        System.out.println("Largest number: " + (maximum));
    }
}