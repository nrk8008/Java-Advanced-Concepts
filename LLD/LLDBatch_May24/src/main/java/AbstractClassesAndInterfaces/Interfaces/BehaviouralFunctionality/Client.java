package AbstractClassesAndInterfaces.Interfaces.BehaviouralFunctionality;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<Player>();

        Player player1 = new Player(60, "Rajesh", 20);
        Player player2 = new Player(50, "kumar", 22);
        Player player3 = new Player(1, "Usha", 34);

        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting: " + footballTeam);

        Collections.sort(footballTeam);
        System.out.println("After Sorting: " + footballTeam);
    }
}
