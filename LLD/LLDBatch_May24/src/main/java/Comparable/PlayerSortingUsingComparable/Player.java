package Comparable.PlayerSortingUsingComparable;

import ch.qos.logback.classic.spi.LoggerComparator;

public class Player implements Comparable<Player> {
    private String name;
    private int age;
    private int ranking;
    public Player(String name, int age, int ranking) {
        this.name = name;
        this.age = age;
        this.ranking = ranking;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getRanking() {
        return ranking;
    }

    @Override
    public int compareTo(Player o) {
        if (this.getRanking() < o.getRanking()) {
            return -1;
        }
        if (this.getRanking() > o.getRanking()) {
            return 1;
        }
        return 0;


        //return Integer.compare(this.getRanking(), o.getRanking());

    }
    @Override
    public String toString() {
        return  name + " "+ age + " " + ranking ;
    }
}
