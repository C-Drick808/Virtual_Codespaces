package CedrickProgram.ProjectGame.GameApp;

import java.util.ArrayList;

public class Rattata extends Pokemon implements Normal{

    final static int BASICATTACK = 10;
    final static ArrayList<String> ATTACKPROS = new ArrayList<>();

    @Override
    public void BasicAttack(int basicAttack) {

    }

    @Override
    public void TypeAttackPros() {

    }
    public Rattata(int id, String name, String type) {
        super(id, name, type);
        normalPokemonStatistics(id,name,type);
        TypeAttackPros();
        ATTACKPROS.add("")
    }
}
