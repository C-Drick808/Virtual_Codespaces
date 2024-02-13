package CedrickProgram.Pokemon;

import java.util.ArrayList;

public class Bulbasaur extends Wild implements Grass{

    protected int bulbaId;
    protected String bulbaName;
    protected String bulbaType;
    protected float bulbaHeight;
    protected float bulbaWeight;
    protected String bulbaGender;
    protected String bulbaCategory;
    protected String bulbaAbilities;
    protected int bulbaHp;
    protected int bulbaAttack;
    protected int bulbaDefense;
    protected int bulbaSpAttack;
    protected int bulbaSpDefense;
    protected int bulbaSpeed;

    public ArrayList<String> arryWeakness = new ArrayList<String>();


    public Bulbasaur(int id, String name, String type, float height, float weight,
                     char gender, String category, String abilities) {

        super(id, name, type, height, weight, gender, category, abilities);

        if (id == 1 && type == "Grass"){

            this.bulbaId = id;
            this.bulbaName = name;
            this.bulbaType = type;
            this.bulbaHeight = height;
            this.bulbaWeight = weight;
            this.bulbaGender = String.valueOf(gender);
            this.bulbaCategory = category;
            this.bulbaAbilities = abilities;
            if (bulbaHeight > 0.9F || bulbaWeight > 6.2F){

                int multiplier = 0;

                if (bulbaHeight == 0.9F && bulbaWeight == 6.2F){
                    multiplier = 2;
                } else if (bulbaWeight > 6.3F && bulbaGender.equalsIgnoreCase("MALE")) {
                    multiplier = 3;
                }

                this.bulbaHp = Grass.hp * multiplier;
                this.bulbaAttack = Grass.attack * multiplier;
                this.bulbaDefense = Grass.defense * multiplier;
                this.bulbaSpAttack = Grass.spAttack * multiplier;
                this.bulbaSpDefense = Grass.spDefense * multiplier;
                this.bulbaSpeed = Grass.speed * multiplier;

            }else {

                this.bulbaHp = (int) (Grass.hp * 1.1F);
                this.bulbaAttack = (int) (Grass.attack * 1.1F);
                this.bulbaDefense = (int) (Grass.defense * 1.1F);
                this.bulbaSpAttack = (int) (Grass.spAttack * 1.1F);
                this.bulbaSpDefense = (int) (Grass.spDefense * 1.1F);
                this.bulbaSpeed = (int) (Grass.speed * 1.1F);

            }

        }else {
            System.out.println("Not A Bulbasaur");
        }
    }

    @Override
    public int getBasicAttack() {
        return 10;
    }
    /*public Bulbasaur(){
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
        return 10;
    }
    public boolean isWeakness(){

        if (arryWeakness.contains("Fire")){

        }
        return true;
    }*/

}
