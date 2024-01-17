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
        
        System.out.print("Enter a First number: ");
        int num1 = input.nextInt();
        arrayNumber.add(num1);
        System.out.print("Enter a Second number: ");
        int num2 = input.nextInt();
        arrayNumber.add(num2);
        System.out.print("Enter a Third number: ");
        int num3 = input.nextInt();
        arrayNumber.add(num3);
        input.close();

        int maximum = arrayNumber.get(0);
        for (int i = 1; i < arrayNumber.size(); i++) {
            if (maximum < arrayNumber.get(i)){
                maximum = arrayNumber.get(i);
                System.out.println("The largest number is : " + maximum);
            }
        }

        if (arrayNumber.equals()) {
            System.out.println("All the numbers are equal");
        }
    }
}