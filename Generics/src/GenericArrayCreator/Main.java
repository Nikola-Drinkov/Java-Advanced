package GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = ArrayCreator.create(Integer.class,10,123);
        for(int integer:integers){
            System.out.print(integer+" ");
        }
    }
}
