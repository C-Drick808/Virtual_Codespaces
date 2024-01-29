package Builder;

public class PokemonStats {
    private int hp;
    private int attack;

    @Override
    public String toString() {
        return "PokemonStats{" +
                "hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", spAttack=" + spAttack +
                ", spDefense=" + spDefense +
                ", speed=" + speed +
                ", total=" + total +
                ", isSuperPotion=" + isSuperPotion +
                '}';
    }

    private int defense;
    private int spAttack;
    private int spDefense;
    private int speed;
    private int total;

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public int getSpDefense() {
        return spDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTotal() {
        return total;
    }

    public boolean isSuperPotion() {
        return isSuperPotion;
    }
    //Optional
    private boolean isSuperPotion;


    private PokemonStats(Statatistic builder){

        this.hp = builder.hp;
        this.attack = builder.attack;
        this.defense = builder.defense;
        this.spAttack = builder.spAttack;
        this.spDefense = builder.spDefense;
        this.speed = builder.speed;
        this.total = builder.total;

    }

    public static class Statatistic{

        private int hp;
        private int attack;
        private int defense;
        private int spAttack;
        private int spDefense;
        private int speed;
        private int total;


        public Statatistic(int hp,int attack, int defense, int spAttack, int spDefense, int speed, int total) {
            this.hp = hp;
            this.attack = attack;
            this.defense = defense;
            this.spAttack = spAttack;
            this.spDefense = spDefense;
            this.speed = speed;
            this.total = total;
        }

        public PokemonStats build(){
            return new PokemonStats(this);
        }
    }



}
