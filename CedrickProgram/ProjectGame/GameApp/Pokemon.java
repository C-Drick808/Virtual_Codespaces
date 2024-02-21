package CedrickProgram.ProjectGame.GameApp;

import java.util.ArrayList;

class Pokemon extends Pokedex {

    private static int id;
    private static String name;
    private static String type;
    private static int hp;
    private static int attack;
    private static int defense;
    private static int spAttack;
    private static int spDefense;
    private static int speed;

    private static int basickAttack;
    private static String[] attackPros;

    public Pokemon(int id, String name, String type) {

        Pokemon.id = id;
        Pokemon.name = name;
        Pokemon.type = type;
    }

    @Override
    public int getPokemonId() {
        return id;
    }

    @Override
    public String getPokemonName() {
        return name;
    }

    @Override
    public String getPokemonType() {
        return type;
    }

    @Override
    public int getPokemonHp() {
        return hp;
    }

    @Override
    public int getPokemonAttack() {
        return attack;
    }

    @Override
    public int getPokemonDefense() {
        return defense;
    }

    @Override
    public int getPokemonSpAttack() {
        return spAttack;
    }

    @Override
    public int getPokemonSpDefense() {
        return spDefense;
    }

    @Override
    public int getPokemonSpeed() {
        return speed;
    }

    @Override
    public int getPokemonTotalStats() {
        return hp+attack+defense+spAttack+spDefense+speed;
    }

    @Override
    public String[] getTypeAttackPros() {
        return attackPros;
    }

    @Override
    public int getBasicAttack() {
        return basickAttack;
    }


    public void setBasickAttack(int basicAttack){
        Pokemon.basickAttack = basicAttack;
    }

    public static void setAttackPros(ArrayList<String> attackPros) {
        Pokemon.attackPros = attackPros.toArray(new String[0]);
    }

    @Override
    public void setPokemonStats(int hp, int attack, int defense, int spAttack, int spDefense, int speed) {
        Pokemon.hp = hp;
        Pokemon.attack = attack;
        Pokemon.defense = defense;
        Pokemon.spAttack = spAttack;
        Pokemon.spDefense = spDefense;
        Pokemon.speed = speed;
    }


}
