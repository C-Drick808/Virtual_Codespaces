package CedrickProgram.Java_Tesda;

import java.util.Scanner;

public class GeneratePattern {

    private static boolean isStatus;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StarPattern shape = new StarPattern();
        do {
            System.out.println("Enter a number shape pattern [1|2|3]: ");
            int select = scanner.nextInt();
            switch (select){
                case 1:{
                    System.out.println("How manny rows: ");
                    int row = scanner.nextInt();
                    System.out.println("Shape 1\n");
                    shape.Pattern((byte) row);
                    break;
                }
                case 2:{
                    System.out.println("How manny rows: ");
                    int row = scanner.nextInt();
                    System.out.println("Shape 2\n");
                    shape.Pattern((short)row);
                    break;
                }
                case 3:{
                    System.out.println("How manny rows: ");
                    int row = scanner.nextInt();
                    System.out.println("Shape 3\n");
                    shape.Pattern(row);
                    break;
                }
                case 0:{
                    System.out.println("Closing Program ...");
                    isStatus = true;
                    break;
                }
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }while(!isStatus);
        scanner.close();
}
static class StarPattern {

    public void Pattern(byte x) {
        for (int i = 1; i <= x; ++i) {  //Outer loop for rows
            for (int j = 1; j <= i; ++j) { //Inner loop for Col
                System.out.print("* "); //Print *
            }
            System.out.println(); //New line
        }
    }
    public void Pattern(short x) {
        for (int i = 1; i <= x; i++) {
            for (int j = i; j < x; j++) { //Rows Loop
                System.out.print(" "); // Blank Space
            }
            for (int k = 1; k <= i; k++) { //Cols Loop
                System.out.print("*"); // Prints *
            }
            System.out.println(" ");
        }
        for (int i = x; i >= 1; i--) {
            for (int j = i; j <= x; j++) { //Rows Loop
                System.out.print("");  // Prints blank spaces
            }
            for (int k = 1; k < i; k++) { //Col Loop
                System.out.print("*");  // Prints *
            }
            System.out.println(""); // New Line1
        }
    }

    public void Pattern(int x) {
        for (int i = 0; i <= x - 1; i++) { //For Loop for Row
            for (int j = 0; j <= i; j++) { //For Loop for Col
                System.out.print("*" + " "); //prints * and blank space
            }
            System.out.println(""); // new line
        }
        for (int i = x - 1; i >= 0; i--) { //For Loop for Row
            for (int j = 0; j <= i - 1; j++) { //For Loop for Col
                System.out.print("*" + " "); //prints * and blank space
            }
            System.out.println("");// new line
        }
    }
    }
}