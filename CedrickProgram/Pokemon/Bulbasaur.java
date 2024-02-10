package CedrickProgram.Pokemon;

public class Bulbasaur extends Wild implements Grass{

    protected static int bulbaId;
    protected static int bulbaName;
    protected static int bulbaType;
    protected static int bulbaHeight;
    protected static int bulbaWeight;
    protected static int bulbaCategory;
    protected static int bulbaAbilities;
    protected static int bulbaHp;
    protected static int bulbaAttack;
    protected static int bulbaDefense;
    protected static int bulbaSpAttack;
    protected static int bulbaSpDefense;
    protected static int bulbaSpeed;


    public Bulbasaur(int id, String name, String type, float height, float weight, char gender, String category,String abilities, int hp, int attack, int defense, int spAttack, int spDefense, int speed) {

        super(id, name, type, height, weight, gender, category, abilities, hp, attack, defense, spAttack, spDefense, speed);

    }
    public Bulbasaur(){
        super();
        setId(1);
        setName("Bulbasaur");
        setType("Grass");
        setHeight(0.7F);
        setWeight(6.9F);
        setCategory("Seed Pokemon");
        setAbilities("Overgrow");
        setHp(45);
        setAttack(49);
        setDefense(49);
        setSpAttack(65);
        setSpDefense(65);
        setSpeed(45);
    }


    @Override
    public int getBasicAttack() {
        int basicAttackDamage = 10;
        return basicAttackDamage;
    }
}
