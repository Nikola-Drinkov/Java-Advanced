package ListIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator<T> implements Iterable<T>{
    private int index;
    private List<T> list;

    public ListyIterator(T... elements) {
        index = 0;
        list = Arrays.asList(elements);
    }
    public boolean Move(){
        if(HasNext()){
            index++;
            return true;
        }
        return false;
    }
    public void Print(){
        System.out.println(list.get(index));
    }

    public boolean HasNext(){
        return index<list.size()-1;
    }


    @Override
    public Iterator<T> iterator() {
        return new listIter() ;
    }
     private class listIter implements Iterator<T>{
        private int counter;
         public listIter() {
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return this.counter<list.size();
        }

        @Override
        public T next() {
            T result = list.get(counter);
            counter++;
            return result;
        }
    }
}
