import Template.PokemonTemplate;
import Template.fireType;
import Template.normalType;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PokemonTemplate pkTemplate = new fireType();

        //Using template method
        pkTemplate.BUILDPOKEDEX();
        System.out.println("**********");

        pkTemplate = new normalType();
        pkTemplate.BUILDPOKEDEX();
    }
}