package CustomList_07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>>{
    private List<T> data;
    public CustomList(){
        this.data = new ArrayList<>();
    }
    public void add(T element){
        this.data.add(element);
    }
    public T remove(int index){
        if(checkIndex(index)) {
            return this.data.remove(index);
        }
        throw new IndexOutOfBoundsException();
    }
    public boolean contains (T element){
        return data.contains(element);
    }
    public void swap(int index1, int index2){
        if(checkIndex(index1)&&checkIndex(index2)){
            T first = this.data.get(index1);
            T second = this.data.get(index2);
            this.data.set(index1,second);
            this.data.set(index2,first);
        }
    }
    public int countGreaterThan(T element){
        int count = 0;
        for(T el:this.data){
            if(el.compareTo(element)>0) count++;
        }
        return count;
    }
    public T getMax(){
        if(!this.data.isEmpty()){
            T max = this.data.get(0);
            for(T el:this.data){
                if(el.compareTo(max)>0) max=el;
            }
            return max;
        }
        throw new NullPointerException();
    }
    public T getMin(){
        if(!this.data.isEmpty()){
            T min = this.data.get(0);
            for(T el:this.data){
                if(el.compareTo(min)<0) min=el;
            }
            return min;
        }
        throw new NullPointerException();
    }
    public boolean checkIndex(int index){
        return index>=0&&index<data.size();
    }


    public Iterator<T> iterator(){
        return new Iterator<T>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<data.size();
            }
            @Override
            public T next() {
                return data.get(index++);
            }
        };
   }
}
