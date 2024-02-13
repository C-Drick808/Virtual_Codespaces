package CedrickProgram.Pokemon;

public interface TrainCharmander {

    Charmander charmander = new Charmander();
    int id = charmander.getId();
    String name = charmander.getName();
    String type = charmander.getType();
    float height = charmander.getHeight();
    float weight = charmander.getWeight();
    String categories = charmander.getCategories();
    String abilities = charmander.getAbilities();
    char gender = charmander.getGender();
    String trainer = "Java God";

    int statsHp = charmander.getHp();
    int statsAttack = charmander.getAttack();
    int statsDefense = charmander.getDefense();
    int statsSpAttack = charmander.getSpAttack();
    int statsSpDefense = charmander.getSpDefense();
    int statsSpeed = charmander.getSpeed();
    int statsTotal = 309;
}
