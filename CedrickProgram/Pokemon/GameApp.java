package CedrickProgram.Pokemon;

import java.util.Arrays;
import java.util.Scanner;

public class GameApp{


    public static Scanner scanner = new Scanner(System.in);



    protected static void PokemonBattle() {
        PokemonBattleGame pokemonBattleGame = new PokemonBattleGame() {
            @Override
            protected String[] getRival() {
                

                return new String[0];
            }

            @Override
            public void duel() {
                System.out.println("Yawa2x");
            }
        };

        System.out.println("\t###################################################");
        System.out.println("\t    • [1] Bulbasaur [2] Charmander [3] Squirtle •");
        System.out.println("\t###################################################");
        System.out.print("   -> Choose A Pokemon: ");
        int selectFriend = scanner.nextInt();
        switch (selectFriend){
            case 1:{
                System.out.println("I Choose Bulbasaur");
                System.out.println("Tada...");
                System.out.print("Please Enter your Name: ");
                String trainerName = scanner.next();
                setMatchUp(trainerName,"Bulbasaur");
                scanner.close();
                break;
            } case 2:{
                System.out.println("I Choose Charmander");
                System.out.println("Tada...");
                System.out.print("Please Enter your Name: ");
                String trainerName = scanner.next();
                setMatchUp(trainerName,"Charmander");
                scanner.close();
                break;
            } case 3:{
                System.out.println("I Choose Squirtle");
                System.out.println("Tada...");
                System.out.print("Please Enter your Name: ");
                String trainerName = scanner.next();
                setMatchUp(trainerName,"Squirtle");
                scanner.close();
                break;
            }
        }
    }



    public static void play(){

        System.out.println("\t\t **********************************");
        System.out.println("\t\t * \t\t    T.E.S.D.A \t\t\t  *");
        System.out.println("\t\t * \t\t  FINAL PROJECT \t\t  *");
        System.out.println("\t\t * \t\t [1] Hunt Pokemon \t\t  *");
        System.out.println("\t\t * \t\t [2] Pokemon Battle \t  *");
        System.out.println("\t\t * \t\t [3] Quit Game \t\t      *");
        System.out.println("\t\t **********************************");
        System.out.print("\t  \n - > Select A Number Game [1/2]: ");
        int selectGame = scanner.nextInt();
        switch (selectGame){
            case 1:{
                System.out.println("\n HUNT POKEMON!");
                System.out.println("******************************************");
                break;
            } case 2:{
                System.out.println("\nPokemon Battle!\n");
                PokemonBattle();
                break;
            } case 3:{
                System.out.println("\nQuit Game !");
                System.out.println("The Game Is Closed...");
                break;
            }
            default:
                System.out.println("Please Enter A Number From One,Two Or Three.");
                break;
        }
        scanner.close();
    }

    public static void setMatchUp(String trainerName, String pokemonFriend){

        System.out.println("////////////////////////////////////////////////////////////////");
        System.out.println("// \t [1] Java ARENA \t [2] Python ARENA \t [3] C++ Arena   //");
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.print("\n -> Select An Opponent: ");
        int selectOpponnet = scanner.nextInt();
        switch (selectOpponnet){
            case 1:{
                System.out.println("ARENA OF JAVA");
                break;
            } case 2:{
                System.out.println("ARENA OF PYTHON");
                break;
            } case 3:{
                System.out.println("ARENA OF C++");
                break;
            }
        }



    }

}
