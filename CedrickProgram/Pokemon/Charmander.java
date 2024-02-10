package CedrickProgram.Pokemon;

public class Charmander extends  Wild{

    public Charmander(int id, String name, String type, float height, float weight, char gender,
                      String category,String abilities, int hp, int attack, int defense, int spAttack, int spDefense, int speed) {

        super(id, name, type, height, weight, gender, category, abilities, hp, attack, defense, spAttack, spDefense, speed);

    }
    public Charmander(){
        super();
        setId(4);
        setName("Charmander");
        setType("Fire");
        setHeight(0.6F);
        setWeight(8.5F);
        setCategory("Lizard Pokemon");
        setAbilities("Blaze");
        setHp(39);
        setAttack(52);
        setDefense(43);
        setSpAttack(60);
        setSpDefense(50);
        setSpeed(65);
    }

}
