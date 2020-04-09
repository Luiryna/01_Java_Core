package task3.wow;

import task3.wow.Character;
import task3.wow.Fraction;

import java.util.List;

public class Guild {
    private String name;
    private Fraction guildFraction;
    private List<Character> members;

    @SuppressWarnings("unused")
    public void add(Character character) {
        members.add(character);
    }

    @SuppressWarnings("unused")
    public void remove(Character character) {
        members.remove(character);
    }

    @SuppressWarnings("unused")
    public List<Character> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Guild{" +
                "name='" + name + '\'' +
                ", guildFraction=" + guildFraction +
                ", members=" + members +
                '}';
    }
}
