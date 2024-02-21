package CedrickProgram.ProjectGame.GameApp;

public class PokemonFactory {

    public static Pokedex getPokedex(int pkId, String pkName, String pkType){
        if (16 == pkId) return new Pidgey(pkId,pkName,pkType);

        return null;
    }
}
