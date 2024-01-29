package CedrickProgram.Java_Tesda;
import java.util.Scanner;

public class NumberToMonth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number of Month: ");
        int numMonth = scanner.nextInt();
        switch (numMonth){

            case 1:{
                System.out.println("Month of January Total Days of 31");
                break;
            }case 2:{
                System.out.println("Month of February Total Days of 29");
                break;
            }case 3:{
                System.out.println("Month of March Total Days of 31");
                break;
            }case 4:{
                System.out.println("Month of April Total Days of 30");
                break;
            }case 5:{
                System.out.println("Month of May Total Days of 31");
                break;
            }
            case 6:{
                System.out.println("Month of June Total Days of 31");
                break;
            }
            case 7:{
                System.out.println("Month of July Total Days of 31");
                break;
            }
            case 8:{
                System.out.println("Month of August Total Days of 31");
                break;
            }
            case 9:{
                System.out.println("Month of September Total Days of 31");
                break;
            }
            case 10:{
                System.out.println("Month of October Total Days of 31");
                break;
            }
            case 11:{
                System.out.println("Month of November Total Days of 31");
                break;
            }case 12: {
                System.out.println("Month of December Total Days of 31");
                break;
            }
        }
    }
}
