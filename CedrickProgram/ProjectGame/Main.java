package CedrickProgram.ProjectGame;

import CedrickProgram.ProjectGame.GameApp.*;



public class Main {

    public static void main(String[] args) {


        //GameApp.play();
        Pokedex pidgey = PokemonFactory.getPokedex(16,"Pidgey","Normal");
        //boolean isWeak = Arrays.stream(pidgey.getTypeAttackPros()).anyMatch("false"::equalsIgnoreCase);
        System.out.println(pidgey);

    }
}
