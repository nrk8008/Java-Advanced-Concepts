package Comparable.PlayerSortingUsingComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Client {
    public static void main(String[] args) {
        ArrayList<Player> footballTeam = new ArrayList<Player>();
        //Player p1 = new Player("Jhon", 20, 59);
        footballTeam.add(new Player("Jhon", 20, 59));
       // Player p2 = new Player("Roger", 22, 60);
        footballTeam.add(new Player("Roger", 22, 60));
        //Player p3 = new Player("Steven", 24, 45);
        footballTeam.add(new Player("Steven", 24, 45));

        System.out.println("Before Sorting: " + footballTeam );
//        for(Player p : footballTeam) {
//            System.out.println(p.getName() + " " + p.getAge()+" "+p.getRanking());
//        }

        Collections.sort(footballTeam);

        System.out.println("After Sorting: " + footballTeam );
//        for(Player p : footballTeam) {
//            System.out.println(p.getName() + " " + p.getAge()+" "+p.getRanking());
//        }
    }
}
