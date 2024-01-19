package CedrickProgram.Java_Tesda;


public class SumOfIntegerTask {

    private static int additionOfAll(int...number){
        int sum = 0;  
        for (int i : number)  
        sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("This is the total sum of all integer: "+additionOfAll(5,10,15,20,100,25,200));  
    }
}
