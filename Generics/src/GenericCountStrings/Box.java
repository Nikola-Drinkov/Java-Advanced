package GenericCountStrings;

import java.util.Comparator;
import java.util.List;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",data.getClass().getName(),data);
    }

    public static<T> void swap(List<T> list, int index1, int index2){
        if(checkIndex(list,index1)&&checkIndex(list,index2)){
            T first = list.get(index1);
            T second = list.get(index2);
            list.set(index1,second);
            list.set(index2,first);
        }
    }
    public static<T> boolean checkIndex(List<T> list, int index){
        return (index>=0&&index<list.size());
    }

    @Override
    public int compareTo(Box<T> o) {
        return this.data.compareTo(o.data);
    }
}
