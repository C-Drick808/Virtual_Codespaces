package CedrickProgram.ProjectGame.GameApp;
import java.util.ArrayList;
import java.util.List;

public interface Normal extends PokemonType{
    String type = "Normal";
    default void normalPokemonStatistics(int pkId,String pkName, String pkType){

        Pokemon pk = new Pokemon();
        if (pkId == 16 && pkType.equalsIgnoreCase("Normal")|| pkName.equalsIgnoreCase("Pidgey")){
            pk.setPokemonStats(40,45,40,35,35,56);
        }
    }


    void BasicAttack(int basicAttack);

}
