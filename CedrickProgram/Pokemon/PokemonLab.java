package CedrickProgram.Pokemon;

public class PokemonLab extends Wild{

    protected int id;
    protected String name;
    protected float height;
    protected float weight;
    protected char gender;
    protected String category;
    protected String abilities;

    public PokemonLab(int id, String name, float height, float weight, char gender,
                      String category, String abilities) {

        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.category = category;
        this.abilities = abilities;
    }
    public PokemonLab(){

    }


}
