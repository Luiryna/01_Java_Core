package task4;

import task4.reflection.ReflectionPrinter;
import task4.wow.Character;


public class Runner {
    public static void main(String[] args) {
        ReflectionPrinter reflectionHandler = new ReflectionPrinter();
        Class<Character> carClass = Character.class;
        reflectionHandler.printAllFields(carClass);
        reflectionHandler.printAllMethods(carClass);
    }
}
