package CedrickProgram.Java_Tesda.SampleCode;

public class ClassName {
    public static void main(String[] args) {
        String name[] = new String[2];

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[])objects;
        //againStrings[0] = new StringBuilder();
        objects[0] = new StringBuilder(); 

        System.out.println("This is strings" + strings);


    }
    
}
