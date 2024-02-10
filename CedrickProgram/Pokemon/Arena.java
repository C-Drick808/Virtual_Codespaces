package CedrickProgram.Pokemon;

abstract class Arena {

    protected int HP1;
    protected int HP2;
    protected boolean isFainted;

    public abstract void duel(String playerName,String pokemonName, String pokemonType, char pokemonGender);


}
