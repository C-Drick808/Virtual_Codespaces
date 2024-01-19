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
        input.close();
    
        int lenghtOfWord = sbtypeWord.length();
        int firstCharPosition = (lenghtOfWord - lenghtOfWord);
        int lastCharPosition = (lenghtOfWord - 1);
        char firstCharacterWord = typedWord.charAt(firstCharPosition);
        char lastCharacterWord = typedWord.charAt(lastCharPosition);
        int indexStringA = sbtypeWord.indexOf("a");
        int substring1Position = (lenghtOfWord - lenghtOfWord) + 3;
        int substring2Position = (lenghtOfWord - lenghtOfWord) + 7;
        String substringIndex = typedWord.substring(substring1Position,substring2Position);
        StringBuilder placeLastPos = sbtypeWord.append("123");
        StringBuilder placeFourthPos = sbtypeWord.insert(4,"xyz");
        StringBuilder del2Pos4 = sbtypeWord.delete(2, 4);
        StringBuilder delPos8 = sbtypeWord.deleteCharAt(8);
        StringBuilder reversedTypedWord = sbtypeWord.reverse();




        System.out.println("Print the length of the string. "+lenghtOfWord);
        System.out.println("Print the first character of the string. "+firstCharacterWord);
        System.out.println("Print the last character of the string. "+lastCharacterWord);
        System.out.println("Print the index of the first occurrence of the letter 'a' in the string. "+indexStringA);
        System.out.println("Print the substring of the string from index 3 to index 6. "+substringIndex);
        System.out.println("Append the string \"123\" to the end of the string. "+placeLastPos);
        System.out.println("Insert the string \"xyz\" at index 4. "+placeFourthPos);
        System.out.println("Delete the substring from index 2 to index 4. "+del2Pos4);
        System.out.println("Delete the character at index 8. "+delPos8);
        System.out.println("Reverse the string and print it. "+reversedTypedWord); 

        










        /*
            Your program should utilize the charAt(), indexOf(), length(), substring(), append(), insert(), delete(), 
            deleteCharAt(), and reverse() methods of the StringBuilder class.
         */
    }
}