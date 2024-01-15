package CedrickProgram.Java_Tesda.SampleCode;

public class ArrayType {
    public static void main(String[] args) {
        String [] bugs = {"cricket","beetle","ladybug"};
        String [] allias = bugs;

        System.out.println(bugs.equals(allias));
        System.out.println(bugs.toString());
    }
    
}
