package CedrickProgram.Pokemon;

public abstract class Pokemon extends Pokedex {

    private int id;
    private String name;
    private float height;
    private float weight;
    private char gender;
    private String category;
    private String abilities;

    private int hp;
    private int attack;
    private int defense;
    private int spAttack;
    private int spDefense;
    private int speed;

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                ", category='" + category + '\'' +
                ", abilities='" + abilities + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public char getGender() {
        return gender;
    }

    public String getCategory() {
        return category;
    }

    public String getAbilities() {
        return abilities;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public void setSpAttack(int spAttack) {
        this.spAttack = spAttack;
    }

    public int getSpDefense() {
        return spDefense;
    }

    public void setSpDefense(int spDefense) {
        this.spDefense = spDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }





}
