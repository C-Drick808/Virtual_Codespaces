package CedrickProgram.Pokemon;

public interface TrainCharmander {

    String name = "Charmander";
    String type = "Fire";
    String categories = "Lizard Pokemon";
    String abilities = "Blaze";
    char gender = 'M';
    String trainer = "Java God";

    int statsHp = 39;
    int statsAttack = 52;
    int statsDefense = 43;
    int statsSpAttack = 60;
    int statsSpDefense = 50;
    int statsSpeed = 65;
    int statsTotal = 309;

    int basicAttack();
}
