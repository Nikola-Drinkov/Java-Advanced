package GenericBox;

import java.util.List;

public class Box<T> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",data.getClass().getName(),data);
    }
}
