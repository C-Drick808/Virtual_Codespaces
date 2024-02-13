package CedrickProgram.Pokemon;

import java.util.Scanner;

public class PokemonBattleGame{

    private final String challengerName;
    private final char challengerGender;
    private String challengerPokemon;

    public static Scanner scanner = new Scanner(System.in);

    public PokemonBattleGame(){

        System.out.println("\t <> WELCOME TO POKEMON BATTLE <>");
        System.out.print("\n - What's your name: ");
        this.challengerName = scanner.next();
        System.out.print(" - What's your gender: ");
        this.challengerGender = scanner.next().charAt(0);
        System.out.println("\n\t###################################################");
        System.out.println("\t    • [1] Bulbasaur [2] Charmander [3] Squirtle •");
        System.out.println("\t###################################################");
        System.out.print("\t   -> Which Pokemon do you resonate with?: ");
        int selectFriend = scanner.nextInt();
        switch (selectFriend){
            case 1:{
                this.challengerPokemon = "Bulbasaur";
                prepareArena();
                scanner.close();
                break;
            } case 2:{
                this.challengerPokemon = "Charmander";
                prepareArena();
                scanner.close();
                break;
            } case 3:{
                this.challengerPokemon = "Squirtle";
                prepareArena();
                scanner.close();
                break;
            }
        }
    }
    public void prepareArena(){

        System.out.println("\n\n Trainer Card");
        System.out.println(" Name: "+ challengerName);
        System.out.println(" Gender: "+ challengerGender);
        System.out.println(" Pokemon: "+ challengerPokemon +"\n\n");

        System.out.println("////////////////////////////////////////////////////////////////");
        System.out.println("// \t [1] Java ARENA \t [2] Python ARENA \t [3] C++ Arena   //");
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.print("\n -> Select An Opponent: ");
        int selectOpponnet = scanner.nextInt();

        switch (selectOpponnet){
            case 1:{

                String[][] battleInfo = {{challengerName, String.valueOf(challengerGender), challengerPokemon},
                        {JavaGod.arenaName,JavaGod.arenaType,JavaGod.arenaDescription}};

                System.out.println("\n\t\t\t\t ARENA OF JAVA");

                ArenaOfJava java = new ArenaOfJava();
                java.setTrainerDetails();
                java.startBattle();

                break;
            } case 2:{

                String[][] battleInfo = {{challengerName, String.valueOf(challengerGender), challengerPokemon},
                        {JavaGod.arenaName,JavaGod.arenaType,JavaGod.arenaDescription}};

                System.out.println("ARENA OF PYTHON");
                //ArenaOfJava arena = new ArenaOfJava();
                //arena.setMatchUp(battleInfo);
                break;
            } case 3:{

                String[][] battleInfo = {{challengerName, String.valueOf(challengerGender), challengerPokemon},
                        {JavaGod.arenaName,JavaGod.arenaType,JavaGod.arenaDescription}};

                System.out.println("ARENA OF C++");
                //ArenaOfJava arena = new ArenaOfJava();
                //arena.setMatchUp(battleInfo);
                break;
            }
        }
    }
}
