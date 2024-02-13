package CedrickProgram.Pokemon;

public interface TrainBulbasaur {
    Bulbasaur bulbasaur = new Bulbasaur(1,"Bulbasaur","Grass",
            0.9F,6.2F,'M',"Seed Pokemon","Overgrow");

    int id = bulbasaur.getId();
    String name = bulbasaur.getName();
    String type = bulbasaur.getType();
    float height = bulbasaur.getHeight();
    float weight = bulbasaur.getWeight();
    String categories = bulbasaur.getCategories();
    String abilities = bulbasaur.getAbilities();
    char gender = bulbasaur.getGender();
    int statsHp = bulbasaur.getHp();
    int statsAttack = bulbasaur.getAttack();
    int statsDefense = bulbasaur.getDefense();
    int statsSpAttack = bulbasaur.getSpAttack();
    int statsSpDefense = bulbasaur.getSpDefense();
    int statsSpeed = bulbasaur.getSpeed();
    int statsTotal = 309;

    int basicDamage = bulbasaur.getBasicAttack();


}
