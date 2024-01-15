package CedrickProgram.Java_Tesda;

public class OddEvenTask {

    static int check_number = 10;
    public static void main(String[] args) {
        for (int i = 1; i<= 10; i++) {
            String message;
            message = (i % 2 == 0) ? i + " is ODD Number" : i + " is EVEN Number";
            System.out.println(message);
        }
    }
}
