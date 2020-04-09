package task4.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionPrinter {
    public void printAllFields(Class clss) {
        Field[] fields = clss.getDeclaredFields();
        System.out.println("<--- Here is fields --->");
        for (Field field : fields) {
                field.setAccessible(true);
                System.out.println(field.getName());
        }
    }

    public void printAllMethods(Class clss) {
        Method[] methods = clss.getDeclaredMethods();
        System.out.println("<--- Here is methods --->");
        for (Method method : methods) {
            method.setAccessible(true);
            System.out.println(method.getName());
        }
    }

}
