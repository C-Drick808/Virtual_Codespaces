package CedrickProgram.Pokemon;


import java.util.Scanner;

abstract class Arena implements{




    public abstract void setTrainerDetails();

    /*protected String challangerName;
    protected String challangerGender;
    protected String challangerPokemon;
    protected String challengerType;
    protected String challengerCategories;
    protected String challengerAbilities;
    protected char challengerPokemonGender;
    protected int challengerBasicAttack;
    protected int challengerHp;
    protected int challengerAttack;
    protected int challengerDefense;
    protected int challengerSpAttack;
    protected int challengerSpDefense;
    protected int challengerSpeed;



    protected String rivalName;
    protected String rivalGender;
    protected String rivalPokemon;
    protected String rivalType;
    protected String rivalCategories;
    protected String rivalAbilities;
    protected char rivalPokemonGender;
    protected int rivalHp;
    protected int rivalAttack;
    protected int rivalDefense;
    protected int rivalSpAttack;
    protected int rivalSpDefense;
    protected int rivalSpeed;
    private boolean isNextRound;
    private int roundLevel;


     */

    /*public void getBattle(String[][] battleInfo){


        challangerName = battleInfo[0][0];
        challangerGender = battleInfo[0][1];
        challangerPokemon = battleInfo[0][2];
        if (challangerPokemon.equalsIgnoreCase("Bulbasaur")){

            this.challangerPokemon = TrainBulbasaur.name;
            this.challengerType = TrainBulbasaur.type;
            this.challengerCategories = TrainBulbasaur.categories;
            this.challengerAbilities = TrainBulbasaur.abilities;
            this.challengerPokemonGender = TrainBulbasaur.gender;
            this.challengerBasicAttack = TrainBulbasaur.basicDamage;
            this.challengerHp = TrainBulbasaur.statsHp;
            this.challengerAttack = TrainBulbasaur.statsAttack;
            this.challengerDefense = TrainBulbasaur.statsDefense;
            this.challengerSpAttack = TrainBulbasaur.statsSpAttack;
            this.challengerSpDefense = TrainBulbasaur.statsSpDefense;
            this.challengerSpeed = TrainBulbasaur.statsSpeed;
            if (isNextRound){

                if (roundLevel == 1){
                    System.out.println("\n\t Barbaro");
                    rivalPokemon = TrainerBarbaro.trainerPokemon;
                    rivalSpeed = TrainerBarbaro.trainerPokemonSpeed;
                    rivalAttack = TrainerBarbaro.trainerPokemonAttack;
                }

            }

        }


    }

    public int rollDice(){
        return (int) (Math.random()*6)+1;
    }*/


}
