package CedrickProgram.Pokemon;

public class Wild extends Pokemon{

    private int id;
    private String name;
    private String type;

    // POKEMON INFORAMTION
    private float height;
    private float weight;
    private char gender;
    private String category;
    private String abilities;

    // POKEMON STATS
    private int hp;
    private int attack;
    private int defense;
    private int spAttack;
    private int spDefense;
    private int speed;


    public Wild(int id, String name, String type, float height, float weight, char gender, String category, String abilities, int hp, int attack, int defense, int spAttack, int spDefense, int speed) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.category = category;
        this.abilities = abilities;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
    }
    protected Wild(){}




    @Override
    public void getDescription() {
        System.out.println("POKEMON DESCRIPTION");
    }

    @Override
    public void getWeakness() {
        System.out.println("POKEMON WEAKNESSES");
    }

    @Override
    public void insertPokemon() {

        setId(this.id);
        setName(this.name);
        setType(this.type);
        setHeight(this.height);
        setWeight(this.weight);
        setGender(this.gender);
        setCategory(this.category);
        setAbilities(this.abilities);
        setHp(this.hp);
        setAttack(this.attack);
        setDefense(this.defense);
        setSpAttack(this.spAttack);
        setSpDefense(this.spDefense);
        setSpeed(this.speed);
    }
}
