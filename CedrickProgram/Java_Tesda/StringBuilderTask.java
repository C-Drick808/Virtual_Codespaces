package CedrickProgram.Java_Tesda;

import java.util.Scanner;

/**
 * StringBuilderTask
 */
public class StringBuilderTask {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String typedWord = input.nextLine();
        StringBuilder sbtypeWord = new StringBuilder(typedWord);
    
        int lenghtOfWord = sbtypeWord.length();
        int firstCharPosition = (lenghtOfWord - lenghtOfWord);
        int lastCharPosition = (lenghtOfWord - 1);
        char firstCharacterWord = sbtypeWord.charAt(firstCharPosition);
        char lastCharacterWord = sbtypeWord.charAt(lastCharPosition);
        int indexStringA = sbtypeWord.indexOf("a");



        
        System.out.println("Print the length of the string. "+lenghtOfWord);
        System.out.println("Print the first character of the string. "+firstCharacterWord);
        System.out.println("Print the last character of the string. "+lastCharacterWord);
        System.out.println("Print the index of the first occurrence of the letter 'a' in the string. "+indexStringA);
        System.out.println("Print the substring of the string from index 3 to index 6.");
        System.out.println("Append the string \"123\" to the end of the string.");
        System.out.println("Insert the string \"xyz\" at index 4.");
        System.out.println("Delete the substring from index 2 to index 4.");
        System.out.println("Delete the character at index 8.");
        System.out.println("Reverse the string and print it.");










        /*
            Your program should utilize the charAt(), indexOf(), length(), substring(), append(), insert(), delete(), 
            deleteCharAt(), and reverse() methods of the StringBuilder class.
         */
    }
}