package christmas;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private String color;
    private int capacity;
    private List<Present> data;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }
    public int count(){
        return data.size();
    }
    public void add(Present present){
        if (data.size()<capacity) data.add(present);
    }
    public boolean remove(String name){
        for(Present present:data){
            if (present.getName().equals(name)){
                data.remove(present);
                return true;
            }
        }
        return false;
    }
    public Present heaviestPresent(){
        Present heaviest = data.get(0);
        for(Present present:data){
            if(present.getWeight()> heaviest.getWeight())
                heaviest = present;
        }
        return heaviest;
    }
    public Present getPresent(String name){
        for(Present present:data){
            if (present.getName().equals(name)) return present;
        }
        return null;
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.color);
        sb.append(" bag contains:");
        sb.append(System.lineSeparator());
        for(Present present:data){
            sb.append(present.toString());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
