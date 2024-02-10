package CedrickProgram.Pokemon;

abstract class Pokemon extends Pokedex {
    protected static void setId(int pkId){
        Pokemon.id = pkId;
    }
    protected void setName(String pkName){
        Pokemon.name = pkName;
    }
    protected void setType(String pkType){
        Pokemon.type = pkType;
    }
    protected void setHeight(float pkHeight){
        Pokemon.height = pkHeight;
    }
    protected void setWeight(float pkWeight){
        Pokemon.weight = pkWeight;
    }
    protected void setGender(char pkGender){
        Pokemon.gender = pkGender;
    }
    protected void setCategory(String pkCategory){
        Pokemon.category = pkCategory;
    }
    protected void setAbilities(String pkAbilities){
        Pokemon.abilities = pkAbilities;
    }

    protected void setHp(int pkHp){
        Pokemon.hp = pkHp;
    }
    protected void setAttack(int pkAttack){
        Pokemon.attack = pkAttack;
    }
    protected void setDefense(int pkDefense){
        Pokemon.defense = pkDefense;
    }
    protected void setSpAttack(int pkSpAttack){
        Pokemon.spAttack = pkSpAttack;
    }
    protected void setSpDefense(int pkSpDefense){
        Pokemon.spDefense = pkSpDefense;
    }
    protected void setSpeed(int pkSpeed){
        Pokemon.speed = pkSpeed;
    }

    protected int getId(){
        return Pokemon.id;
    }
    protected String getName(){
        return Pokemon.name;
    }
    protected String getType(){
        return Pokemon.type;
    }
    protected float getHeight(){
        return Pokemon.height;
    }
    protected float getWeight(){
        return Pokemon.weight;
    }
    protected char getGender(){
        return Pokemon.gender;
    }
    protected String getCategories(){
        return Pokemon.type;
    }
    protected String getAbilities(){
        return Pokemon.type;
    }

    protected int getHp(){
        return Pokemon.hp;
    }
    protected int getAttack(){return Pokemon.attack;}
    protected int getDefense(){
        return Pokemon.defense;
    }
    protected int getSpAttack(){
        return Pokemon.spAttack;
    }
    protected int getSpDefense(){
        return Pokemon.spDefense;
    }
    protected int getSpeed(){
        return Pokemon.speed;
    }



    public abstract void getDescription();
    public abstract void getWeakness();
}
