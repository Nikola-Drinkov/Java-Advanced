package sanctuary;

import java.util.ArrayList;
import java.util.List;

public class Habitat {
    private int capacity;
    private List<Elephant> data;

    public Habitat(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }
    public void add(Elephant elephant){
        if(data.size()<capacity)
            data.add(elephant);
    }
    public boolean remove(String name){
        for(Elephant elephant:data){
            if(elephant.getName().equals(name)){
                data.remove(elephant);
                return true;
            }
        }
        return false;
    }
    public Elephant getElephant(String retiredFrom){
        for(Elephant elephant:data){
            if(elephant.getRetiredFrom().equals(retiredFrom))
                return elephant;
        }
        return null;
    }
    public Elephant getOldestElephant(){
        Elephant oldest = data.get(0);
        for(Elephant elephant:data){
            if(elephant.getAge()>oldest.getAge())
                oldest = elephant;
        }
        return oldest;
    }
    public int getAllElephants(){
        return data.size();
    }
    public String getReport(){
        StringBuilder sb = new StringBuilder();
        sb.append("Saved elephants in the park:").append(System.lineSeparator());
        for(Elephant elephant:data){
            sb.append(elephant.getName()).append(" ")
                    .append("came from: ").append(elephant.getRetiredFrom())
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }
}
