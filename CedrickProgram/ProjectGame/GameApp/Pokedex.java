package CedrickProgram.ProjectGame.GameApp;

import java.util.Arrays;

public abstract class Pokedex {

    public abstract int getPokemonId();
    public abstract String getPokemonName();
    public abstract String getPokemonType();
    public abstract int getPokemonHp();
    public abstract int getPokemonAttack();
    public abstract int getPokemonDefense();
    public abstract int getPokemonSpAttack();
    public abstract int getPokemonSpDefense();
    public abstract int getPokemonSpeed();
    public abstract int getPokemonTotalStats();
    public abstract String[] getTypeAttackPros();


    public abstract int getBasicAttack();


    public abstract void setPokemonStats(int hp,int attack, int defense, int spAttack, int spDefense, int speed);

    @Override
    public String toString() {
        return "Pokedex{" +
                "\nPOKEMON DATA " +
                " \nPOKEMON ID= " + getPokemonId() +
                " POKEMON NAME= " + getPokemonName() +
                " POKEMON TYPE = " + getPokemonType() +
                " \nPOKEMON STATISTICS" +
                " \nHP= " + getPokemonHp() +
                " ATTACK = " + getPokemonAttack()+
                " DEFENSE = " + getPokemonDefense() +
                " SPECIAL ATTACK = " + getPokemonSpAttack() +
                " SPECIAL DEFENSE = " + getPokemonSpDefense() +
                " SPEED = " + getPokemonSpeed() +
                " TOTAL STATISTICS = " + getPokemonTotalStats() +
                "\nPokemon Type Information\n"+getPokemonType()+" Attack Pros"+ Arrays.toString(getTypeAttackPros()) +
                "}";
    }
}
