package AbstractClassesAndInterfaces.Interfaces.BehaviouralFunctionality;

public class Player implements Comparable<Player> {
    private final int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }
    private int getRanking() {
        return ranking;
    }
    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(getRanking(), otherPlayer.getRanking());
    }
}
