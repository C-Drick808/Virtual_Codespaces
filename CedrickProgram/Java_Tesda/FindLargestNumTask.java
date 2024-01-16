package CedrickProgram.Java_Tesda;

import java.util.ArrayList;

/**
 * FindLargestNumber
 */
public class FindLargestNumTask {
    public static void main(String[] args) {
        ArrayList<Integer> arrNumber = new ArrayList<Integer>();
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