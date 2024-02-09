package CedrickProgram.Pokemon;

public class Charmander extends PokemonLab implements Attack,Fire{

    public Charmander(int id, String name, float height, float weight, char gender,
                     String category, String abilities) {

        super(id, name, height, weight, gender, category, abilities);
    }

    public Charmander(){
        setPokemonData(4,"Charmander",0.7F,6.9F,'M',"Seed Pokemon","Overgrow");
        setPokemonStats(Fire.hp,Fire.attack,Fire.defense,Fire.spAttack,Fire.spDefense,Fire.speed);
    }



    @Override
    public void typeNotEffective() {
        System.out.println("Yawa");
    }

    @Override
    public void typeSuperEffective() {

    }


    @Override
    public String basicAttack() {

        return "Charmander Basicc Attack";
    }
}
