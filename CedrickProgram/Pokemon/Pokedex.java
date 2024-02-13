package CedrickProgram.Pokemon;

abstract class Pokedex {

    // POKEMON DATA
    protected static int id;
    protected static String name;
    protected static String type;

    // POKEMON INFORMATION
    protected static float height;
    protected static float weight;
    protected static char gender;
    protected static String category;
    protected static String abilities;

    // POKEMON STATS
    protected static int hp;
    protected static int attack;
    protected static int defense;
    protected static int spAttack;
    protected static int spDefense;
    protected static int speed;
    protected static int totalStats;

    public abstract void insertPokemon();

    @Override
    public String toString() {
        return "POKEDEX {" + " " +
                "ID= "+ Pokedex.id + " " +
                "NAME= "+ Pokedex.name + " " +
                "TYPE= "+ Pokedex.type + " " +
                "HEIGHT= "+ Pokedex.height + " " +
                "WEIGHT= "+ Pokedex.weight + " "+
                "GENDER= "+ Pokedex.gender + " " +
                "CATEGORY= "+ Pokedex.category + " " +
                "ABILITIES= "+ Pokedex.abilities + " " +
                "HP= "+ Pokedex.hp + " "+
                "ATTACK= "+ Pokedex.attack + " "+
                "DEFENSE= "+ Pokedex.defense + " "+
                "SP ATTACK= "+ Pokedex.spAttack + " "+
                "SP DEFENSE= "+ Pokedex.spDefense + " "+
                "SPEED= "+ Pokedex.speed + " "+
                "TOTAL= "+ Pokedex.totalStats + " "+
                "}";
    }
}
