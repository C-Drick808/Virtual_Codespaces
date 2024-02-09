package CedrickProgram.Pokemon;

import java.util.Scanner;

public class Battle extends PokemonBattle{
    @Override
    public boolean Duel() {

        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();


        Scanner sc = new Scanner(System.in);


        boolean isFainted = false;

        do {




            System.out.println("[1] Basic Attack");
            System.out.println("[2] Skill Moves");
            System.out.println("-> SELECT YOUR CHOICES");
            int select = sc.nextInt();
            switch (select){
                case 1:{
                    System.out.println("BASIC ATTACK");
                    bulbasaur.basicAttack();
                    System.out.println(charmander.getHp());
                    break;
                } case 2:{
                    System.out.println("Skill ATTACK");
                    break;
                }
            }




        }while (!isFainted);







        return true;
    }
}
