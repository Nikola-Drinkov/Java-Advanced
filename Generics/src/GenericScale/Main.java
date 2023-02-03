package GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> integerScale = new Scale<>(1,2);
        System.out.println(integerScale.getHeavier());
    }
}
