package CedrickProgram.Java_Tesda;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
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
        String showArrayListElement = arrayNumber.toString();
        input.close();

        Collections.sort(arrayNumber);
        int sortFirstNumber = arrayNumber.getFirst();
        int sortSecondNumber = arrayNumber.get(1);
        int sortLastNumber = arrayNumber.getLast();
        System.out.println("\nThis is the sort arraylist element: "+sortFirstNumber+" "+sortSecondNumber+" "+sortLastNumber);
        
        String message = sortFirstNumber == sortLastNumber ? "All the numbers are equal "+showArrayListElement:"The largest number is: "+sortLastNumber+"\n"+showArrayListElement;
        System.out.println(message);
    }
}