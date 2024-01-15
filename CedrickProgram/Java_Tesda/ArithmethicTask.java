package CedrickProgram.Java_Tesda;

/**
 * ArithmethicTask
 */
public class ArithmethicTask {

    public static void main(String[] args) {

        int result = 1; // result is now 3
        System.out.println(result+=2);

        result -= 1; // result is now 2
        System.out.println(result);

        result *= 2; // result is now 4
        System.out.println(result);

        result /= 2; // result is now 2
        System.out.println(result);


        result += 8; // result is now 10
        System.out.println(result);
        result %= 7; // result is now 3
        System.out.println(result);
    }
}