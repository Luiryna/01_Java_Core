package task3;

import task3.wow.Character;
import task3.wow.CharacterClass;
import task3.wow.Race;

public class Runner {
    public static void main(String[] args) {
        Character guldan = new Character("Gul'dan", Race.ORC, CharacterClass.WARLOCK);
        System.out.println(guldan.toString());
        System.out.println(guldan.scream());

        Character jaina = new Character("Jaina Proudmoore", Race.HUMAN, CharacterClass.MAGE);
        System.out.println(jaina.toString());
        System.out.println(jaina.scream());
    }
}
