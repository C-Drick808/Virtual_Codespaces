package Template;

import Builder.PokemonStats;

public abstract class PokemonTemplate {

    public final void BUILDPOKEDEX(){
        buildPkData();
        buildPkStats();
        buildPkBreed();
        buildTypeDefense();
        buildPkTraining();
        System.out.println("Pokemon Created");
    }
    private void buildPkStats(){
        //PokemonStats stats = new PokemonStats(10,20,10,20,10,20,10);
       // System.out.println(stats.toString());
    }
    public abstract void buildPkTraining();
    public abstract void buildPkBreed();
    public abstract void buildTypeDefense();

    private void buildPkData(){
        System.out.println("Building foundation data");
    }


    // SAMPLE CODE

    //template method, final so subclasses can't override
    /*public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    //default implementation
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    //methods to be implemented by subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }*/


}
