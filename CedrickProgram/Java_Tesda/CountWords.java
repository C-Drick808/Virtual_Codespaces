package CedrickProgram.Java_Tesda;

import java.util.ArrayList;
import java.util.Scanner;

public class CountWords {

    static int eachWords;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a message - ");
        String paperWords = scanner.nextLine();
        int limitWords = paperWords.length(); 
        scanner.close();

        ArrayList<Character> message = new ArrayList<Character>();

        for(int i=0;i<limitWords;i++){
            char counter = paperWords.charAt(i);
            message.add(counter);
            eachWords = message.size();
        }
        System.out.println("\nMessage: "+message);
        System.out.println("\nThe number of words in an input "+eachWords);


         /*String loremIpsum = """
            Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
            Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a 
            galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, 
            but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s 
            with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing s
            oftware like Aldus PageMaker including versions of Lorem Ipsum.
                 """;*/
    }
    
}
