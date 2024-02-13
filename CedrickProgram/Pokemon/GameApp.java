package CedrickProgram.Pokemon;

import java.util.Scanner;

public class GameApp{

    public static Scanner scanner = new Scanner(System.in);
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
                System.out.println("\n Pokemon Battle!\n");
                new PokemonBattleGame();
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
}
