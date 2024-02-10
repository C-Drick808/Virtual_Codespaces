package CedrickProgram.Pokemon;

import java.util.Scanner;

public class Trainer extends Arena implements TrainCharmander{
    boolean isTurn = false;
    @Override
    public void duel(String playerName,String pokemonName, String pokemonType, char pokemonGender) {
        Scanner scanner = new Scanner(System.in);

        Bulbasaur bulbasaur = new Bulbasaur();

        int HPTrainer1 = bulbasaur.getHp();
        int HPTrainer2 = statsHp;
        do {

            System.out.println(" - "+playerName);
            System.out.println(" - "+bulbasaur.getName()+"\t\t\t\t\t - Pokemon Health = "+HPTrainer1);
            System.out.println(" - "+bulbasaur.getType());
            System.out.println(" - "+bulbasaur.getGender());

            System.out.println("*******************************************************");

            System.out.println(" - "+"Opponent Name");
            System.out.println(" - "+"Opponent Pokemon Name \t\t - Pokemon Health = "+HPTrainer2);
            System.out.println(" - "+"Opponent Pokemon Type");
            System.out.println(" - "+"Opponent Pokemon Gender");

            if (HPTrainer1 == 0 || HPTrainer2== 0){
                System.out.println("\nSomeone pokemon has ben fainted");
                isFainted = true;

            }else
            {
                System.out.println("\n--------------------------------");
                System.out.println("[1] PRESS 1 TO BASIC ATTACK ");
                System.out.println("[2] PRESS 2 TO SKILL ATTACK");
                System.out.println("[3] PRESS 3 TO SWITCH POKEMON");
                System.out.println("[4] PRESS 4 TO SURRENDER");
                System.out.println("[5] PRESS 5 TO SURRENDER");
                System.out.print("-> Select Your Move: ");
                int select = scanner.nextInt();


                switch (select){
                    case 1:{
                        System.out.println("\nBASIC ATTACK\n\n");

                        while (!isTurn){
                            boolean isAttack = false;
                            if (!isAttack){
                                HPTrainer2 -= bulbasaur.getBasicAttack();
                                break;
                            }
                        }
                        HPTrainer1 -= basicAttack();
                        break;
                    } case 2:{
                        System.out.println("SKILL ATTACK");
                        break;
                    } case 3:{
                        System.out.println("SWITCH POKEMON");
                        break;
                    } case 4:{
                        System.out.println("SURRENDER");
                        break;
                    } case 5:{
                        System.out.println("THE BATTLE HAS ENDED");
                        isFainted = true;
                        break;
                    }
                }
            }

        }while (!isFainted);

    }

    @Override
    public int basicAttack() {
        return 8;
    }
}
