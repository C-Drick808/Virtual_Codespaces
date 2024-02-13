package CedrickProgram.Pokemon;

import java.util.Scanner;

public class ArenaOfJava extends Arena{

    private int stageLevel;
    private boolean isFainted;
    private boolean isFinish;
    private int perRounds;
    private boolean isDefeat;

    public Scanner scanner = new Scanner(System.in);

    public void startBattle() {
        do {
            System.out.println("\n\n\t\t\t FIGHT AGAINST SEVEN JAVA LORDS");

            while (stageLevel != 7){

                System.out.println("\n\t |\t [1] Barbaro [2] Cedrick [3] Rizal");
                System.out.println("\t |");

                System.out.print("\t\t - Choose Your Enemies: ");
                int selectRival = scanner.nextInt();

                System.out.println("\n\t\t  Challenger Information");
                System.out.println("\n\t--------------------------------------");
                System.out.println("\t|\t * Trainer Name: " + challangerName);
                System.out.println("\t|\t * Trainer Gender: " + challangerGender);
                System.out.println("\t|\t * Trainer Pokemon: " + challangerPokemon);
                System.out.println("\t--------------------------------------");

                System.out.println("\n\t\t Rival Information");
                System.out.println("\n\t--------------------------------------");
                System.out.println("\t|\t * Trainer Name: " + rivalName);
                System.out.println("\t|\t * Trainer Gender: " + rivalGender);
                System.out.println("\t|\t * Trainer Pokemon: " + rivalPokemon);
                System.out.println("\t--------------------------------------");



                switch (selectRival){
                    case 1:{
                        duel();
                        stageLevel = 7;
                        break;
                    } case 2:{

                    }
                }
                if (stageLevel == 8){
                    System.out.println("Final Boss Java God's");
                    isFinish = true;
                }
            }
        } while (isFinish);
    }

    @Override
    public boolean duel() {

        int hpChallenger = 100;
        int hpRival = 100;

        rivalName = trainerName;
        rivalGender = String.valueOf(trainerGender);
        rivalPokemon = trainerPokemon;

        while (!isFainted) {

            if (perRounds == 0) {
                System.out.print("");
            } else {
                System.out.println("\n\t\t\t    \\\\ Round Number # " + perRounds + " \\\\");
            }

            if (hpRival < 0)
                hpRival = 0;
            else if (hpChallenger < 0)
                hpChallenger = 0;

            System.out.println("\n\t\t\t Pokemon Health Challenger: " + hpChallenger);
            System.out.println("\n\t\t\t Pokemon Health Rival:" + hpRival);

            if (hpRival == 0 || hpChallenger == 0) {
                isFainted = true;
                if (hpChallenger > hpRival) {
                    System.out.println("\n\n Challanger Wins " + challangerName);
                    this.isDefeat = true;
                    scanner.close();
                    nextBattle();
                    break;
                } else {
                    System.out.println("\n\n Rival Wins " + rivalName);
                    this.isDefeat = false;
                    scanner.close();
                    nextBattle();
                    break;
                }
            }

                System.out.println("\n\n\t\t\t -------------------------");
                System.out.println("\t\t\t | \t [1] Basic Attack \t  |");
                System.out.println("\t\t\t | \t [2] Skill Attack \t  |");
                System.out.println("\t\t\t | \t [3] Surrender \t\t  |");
                System.out.println("\t\t\t -------------------------");
                System.out.print("\t\t\t  -> SELECT YOUR ATTACK: ");
                int attackOption = scanner.nextInt();
                switch (attackOption) {
                    case 1: {
                        System.out.println("\n\t\t\t\t  < BASIC ATTACK >");
                        if (challangerPokemon.equalsIgnoreCase("Bulbasaur")) {
                            Bulbasaur bulbasaur = new Bulbasaur();
                            boolean weakness = bulbasaur.isWeakness();
                            if (weakness) {
                                int totalDamage = (bulbasaur.getAttack() * bulbasaur.getBasicAttack() / bulbasaur.getDefense()) + 50;
                                if (bulbasaur.getSpeed() > trainerPokemonSpeed) {

                                    hpRival = bulbasaur.getBasicAttack();
                                    System.out.println("\n You hit basic attack");

                                } else {
                                    // Roll the dice
                                    int diceResult = rollDice();

                                    // Check if the result is odd or even
                                    if (diceResult % 2 == 0) {
                                        System.out.println("\n\n\n You rolled an even number: " + diceResult);
                                        System.out.println(" Missed attack !!!");
                                        int damageRival = (trainerPokemonAttack * trainerBasicAttack / trainerDefense);
                                        hpChallenger -= damageRival;
                                    } else {
                                        System.out.println("\n\n\n You rolled an odd number: " + diceResult);
                                        System.out.println(" You hit basic attack !!!");
                                        hpRival -= totalDamage;
                                    }
                                    perRounds++;
                                }
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("\n SKILL ATTACK");
                    }
                }
        }
        return this.isDefeat;
    }
    public void nextBattle(){
        boolean matchResult = duel();
        if (matchResult){
            System.out.println(" Congrats Next Battle");
        }else {
            System.out.println(" Game Over");
        }
    }

    @Override
    public void setTrainerDetails() {

    }
}



