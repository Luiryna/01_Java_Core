import task2.DynamicParameterizedArray;

public class Runner {
    public static void main(String[] args) {
        DynamicParameterizedArray<Integer> array = new DynamicParameterizedArray<>();

        array.add(1);
        array.add(2);
        array.add(7);

        System.out.println(array.toString());

        array.remove(0);

        System.out.println(array.toString());
    }
}
