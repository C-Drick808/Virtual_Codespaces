package CedrickProgram.ProjectGame.GameApp;

import java.util.ArrayList;

public class Pidgey extends Pokemon implements Normal {
    final static int BASICATTACK = 10;
    final static ArrayList<String> ATTACKPROS = new ArrayList<>();

    public Pidgey(int id, String name, String type) {
        super(id, name, type);
        normalPokemonStatistics(id, name, type);
        BasicAttack(BASICATTACK);
        TypeAttackPros();
    }

    @Override
    public void BasicAttack(int basicAttack) {
        setBasickAttack(basicAttack);
    }
    @Override
    public void TypeAttackPros() {
        ATTACKPROS.add("ROCK");
        ATTACKPROS.addLast("STEEL");
        setAttackPros(ATTACKPROS);
    }
}
