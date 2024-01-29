package CedrickProgram.Java_Tesda;

import java.util.Scanner;


public class Multiplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a table contents;");
        int tbContents = scanner.nextInt();
        Multi multi = new Multi(tbContents);

    }
}

class Multi{
    public Multi(int tableContents) {
        if (tableContents <= 10){
            this.tableContents = tableContents;
            viewTable();
        }else {
            System.out.println("Invalid Input the tables are up to table 10 only");
        }

    }

    public void viewTable() {
        System.out.println("Multiplication Table " + getTableContents());
        int multiplier = getTableContents();
        for (int i = 1; i <= 10; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);
        }
    }



    public int getTableContents() {
        return tableContents;
    }

    private int tableContents;

}
