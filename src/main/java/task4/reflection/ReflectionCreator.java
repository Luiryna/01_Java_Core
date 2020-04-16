package task4.reflection;

import task4.wow.Character;
import task4.wow.CharacterClass;
import task4.wow.Race;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionCreator {
    public void printAllFields(Class clss) {
        Field[] fields = clss.getDeclaredFields();
        System.out.println("<--- Here are fields --->");
        for (Field field : fields) {
                field.setAccessible(true);
                System.out.println(field.getName());
        }
    }

    public void printAllMethods(Class clss) {
        Method[] methods = clss.getDeclaredMethods();
        System.out.println("<--- Here are methods --->");
        for (Method method : methods) {
            method.setAccessible(true);
            System.out.println(method.getName());
        }
    }

    public Object getClassObject(Class clss) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object obj = null;
            obj = clss.getDeclaredConstructor().newInstance();
        return obj;
    }

    public Character instantiateCharacterObject(String name, Race race, CharacterClass characterClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Character character = null;
        Class<Character> characterClss = Character.class;
        Class[] params = {String.class, Race.class, CharacterClass.class};
        character = characterClss.getConstructor(params).newInstance(name, race, characterClass);
        return character;
    }


}
