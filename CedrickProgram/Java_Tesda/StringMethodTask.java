package CedrickProgram.Java_Tesda;
import java.util.Scanner;

public class StringMethodTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a message: ");
        String message = scanner.nextLine();

        int legthOfString = message.length();
        char firstCharacter = message.charAt(0);
        char lastCharacter = message.charAt(legthOfString - 1);

        int secondBegin = (legthOfString - legthOfString) + 1;
        int fifthBegin = (legthOfString - legthOfString) + 6;

        String substringCharacter = message.substring(secondBegin,fifthBegin);

        System.out.println("Find and print the length of the string. " + legthOfString);
        System.out.println("Convert the string to uppercase and print it. " + message.toUpperCase());
        System.out.println("Convert the string to lowercase and print it " + message.toLowerCase());
        System.out.println("Print the first character of the string. " + firstCharacter);
        System.out.println("Print the last character of the string. " + lastCharacter);
        System.out.println("Print the substring starting from the second character to the fifth character of the string " + substringCharacter);
        
    }
    
}
