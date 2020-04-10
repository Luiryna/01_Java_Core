package task4;

import task4.reflection.ReflectionCreator;
import task4.wow.Character;
import task4.wow.CharacterClass;
import task4.wow.Race;

import java.lang.reflect.InvocationTargetException;

public class Runner {
    public static void main(String[] args) {
        ReflectionCreator reflectionHandler = new ReflectionCreator();
        Class<Character> carClass = Character.class;
        reflectionHandler.printAllFields(carClass);
        reflectionHandler.printAllMethods(carClass);

        try {
            Character character = reflectionHandler.instantiateCharacterObject("name1", Race.HUMAN, CharacterClass.MAGE);
            System.out.println(character.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }




    }
}
