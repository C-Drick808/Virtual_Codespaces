package CedrickProgram.Pokemon;

public class Wild extends Pokemon{

    @Override
    public void setPokemonData(int id, String name, float height, float weight, char gender, String category, String abilities) {
        setId(id);
        setName(name);
        setHeight(height);
        setWeight(weight);
        setGender(gender);
        setCategory(category);
        setAbilities(abilities);
    }

    @Override
    public void setPokemonStats(int hp, int attack, int defense, int spAttack, int spDefense, int speed) {
        setHp(hp);
        setAttack(attack);
        setDefense(defense);
        setSpAttack(spAttack);
        setSpDefense(spDefense);
        setSpeed(speed);
    }
}
