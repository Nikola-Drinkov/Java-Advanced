package JarOfT;

import java.util.ArrayDeque;

public class Jar <T>{
    ArrayDeque<T> deque;
    public Jar() {
        deque = new ArrayDeque<>();
    }

    public void add(T element){
        deque.push(element);
    }
    public T remove(){
        return this.deque.pop();
    }
}
