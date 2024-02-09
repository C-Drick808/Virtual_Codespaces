package CedrickProgram.Pokemon;

public abstract class Pokedex {
    public abstract void setPokemonData(int id, String name, float height, float weight, char gender,
                                        String category, String abilities);
    public abstract void setPokemonStats(int hp,int attack,int defense,int spAttack,int spDefense,int speed);
}
