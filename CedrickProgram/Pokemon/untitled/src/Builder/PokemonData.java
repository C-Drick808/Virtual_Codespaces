package Builder;

public class PokemonData {

    protected int nationalNum;
    protected String name;
    protected String type;
    protected String species;

    protected float height;
    protected float weight;
    protected String abilities;


    public PokemonData(int nationalNum, String name,String type, String species, float height, float weight, String abilities) {

        this.nationalNum = nationalNum;
        this.name = name;
        this.type = type;
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.abilities = abilities;
    }

    public void setNationalNum(int nationalNum) {
        this.nationalNum = nationalNum;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }
}
