package CedrickProgram.Pokemon;

public class Bulbasaur extends PokemonLab implements Attack,Grass{


    public Bulbasaur(int id, String name, float height, float weight, char gender,
                     String category, String abilities) {

        super(id, name, height, weight, gender, category, abilities);
    }

    public Bulbasaur(){
        setPokemonData(1,"Bulbasaur",0.7F,6.9F,'M',"Seed Pokemon","Overgrow");
        setPokemonStats(Grass.hp,Grass.attack,Grass.defense,Grass.spAttack,Grass.spDefense,Grass.speed);
    }
    @Override
    public void typeNotEffective() {
        System.out.println("WATER | ELECTRIC | GRASS | GROUND");
    }
    @Override
    public void typeSuperEffective() {
        System.out.println("GROUND | ROCK");

    }

    @Override
    public String basicAttack() {

        int basic = 25;
        int attackFire = Fire.hp - basic;

        return "Basic Attack Bulbasaur";
    }

}
