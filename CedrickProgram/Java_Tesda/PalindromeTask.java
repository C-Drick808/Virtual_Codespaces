package CedrickProgram.Java_Tesda;

import java.util.Scanner;

public class PalindromeTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a words: ");
        String baseWords = input.nextLine();

        input.close();

        StringBuilder sbWords = new StringBuilder(baseWords);
        StringBuilder reverseWord = sbWords.reverse();
        String reverseBase = reverseWord.toString();

        boolean isPalindrome = baseWords.equalsIgnoreCase(reverseBase);
        System.out.println("This is palindrome: " + baseWords + ":" + reverseBase +": " + isPalindrome);
    }
}
