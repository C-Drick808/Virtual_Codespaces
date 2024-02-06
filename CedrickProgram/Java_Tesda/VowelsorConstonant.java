package CedrickProgram.Java_Tesda;

import java.util.Scanner;

public class VowelsorConstonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine();
        word.toLowerCase();

        if (word.equals("a")){
            System.out.println(word + " is Vowel");
        } else if (word.equals("e")) {
            System.out.println(word + " is Vowel");
        } else if (word.equals("i")) {
            System.out.println(word + " is Vowel");
        } else if (word.equals("o")) {
            System.out.println(word + " is Vowel");
        } else if (word.equals("u")) {
            System.out.println(word + " is Vowel");
        }else
            System.out.println(word + " is Constonant");
    }
}
