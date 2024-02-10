package CedrickProgram.Pokemon;

import java.util.Scanner;

public class Trainer extends Arena implements TrainCharmander{
    boolean isTurn = false;
    @Override
    public void duel() {
        Scanner scanner = new Scanner(System.in);

        Bulbasaur bulbasaur = new Bulbasaur();

        try {

            int HPTrainer1 = bulbasaur.getHp();
            int HPTrainer2 = statsHp;

            do {

                if ( HPTrainer1 < 0 || HPTrainer2 < 0){
                    if (HPTrainer1 > HPTrainer2){
                        System.out.println("TRAINER 1 Winner");
                        HPTrainer2 = 0;
                    }else {
                        HPTrainer1 = 0;
                        System.out.println(bulbasaur.getName()+" Health= "+HPTrainer1);
                        System.out.println(name+" Health= "+HPTrainer2);
                        System.out.println(trainer+" Trainer 2 and "+name+" Winner");
                    }
                    isFainted = true;
                    throw new IllegalArgumentException("Input cannot be negative");
                }

                System.out.println(" - "+"Cedrick");
                System.out.println(" - "+bulbasaur.getName()+"\t\t\t\t\t - Pokemon Health = "+HPTrainer1);
                System.out.println(" - "+bulbasaur.getType());
                System.out.println(" - "+bulbasaur.getGender());

                System.out.println("*******************************************************");

                System.out.println(" - "+trainer);
                System.out.println(" - "+name+"\t\t - Pokemon Health = "+HPTrainer2);
                System.out.println(" - "+type);
                System.out.println(" - "+gender);

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
                                System.out.println("\nBulbasaur basic attack = "+bulbasaur.getBasicAttack());
                                break;
                            }
                        }
                        HPTrainer1 -= basicAttack();
                        System.out.println("\nCharmander basic attack = "+basicAttack()+"\n");
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

            }while (!isFainted);
        }catch (IllegalArgumentException e){
            System.out.println("Do you want to contiue ...");
            e.printStackTrace();
        }
    }
    @Override
    public int basicAttack() {
        return 25;
    }
}
