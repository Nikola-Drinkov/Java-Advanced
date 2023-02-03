package ListUtilities;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(33);
        ints.add(445);
        ints.add(456546);
        ints.add(342);
        System.out.println(ListUtils.getMin(ints));
        System.out.println(ListUtils.getMax(ints));
    }
}
