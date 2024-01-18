package CedrickProgram.Java_Tesda;

import java.util.Scanner;

public class PalindromeTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a words: ");
        String baseWords = input.nextLine();

        input.close();

        StringBuilder sbWords = new StringBuilder(baseWords);
        StringBuilder reverseWord = sbWords.reverse();
        String reverseBase = reverseWord.toString();

        //boolean isPalindrome = baseWords.equalsIgnoreCase(reverseBase);
        String message = baseWords.equalsIgnoreCase(reverseBase) ? "Palindrome":"not palindrome";
        System.out.println("Plain Word:"+baseWords + " | "+"Reversed Word:"+ reverseBase +": "+"This is "+message);
    }
}
