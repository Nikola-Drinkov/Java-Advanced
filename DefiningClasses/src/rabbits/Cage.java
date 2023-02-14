package rabbits;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    private List<Rabbit> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
    public void add(Rabbit rabbit){
        if(data.size()<capacity) data.add(rabbit);
    }
    public boolean removeRabbit(String name){
        for(Rabbit rabbit:data){
            if(rabbit.getName().equals(name)) data.remove(rabbit);
            return true;
        }
        return false;
    }
    public void removeSpecies(String species){
        data.removeIf(x->x.getSpecies().equals(species));
    }
    public Rabbit sellRabbit(String name){
        for(Rabbit rabbit:data){
            if(rabbit.getName().equals(name)){
                rabbit.setAvailable(false);
                return rabbit;
            }
        }
        return null;
    }
    public List<Rabbit> sellRabbitBySpecies(String species){
        List<Rabbit> rabbits = new ArrayList<>();
        for(Rabbit rabbit:data){
            if(rabbit.getSpecies().equals(species)){
                rabbit.setAvailable(false);
                rabbits.add(rabbit);
            }
        }
        return rabbits;
    }
    public int count(){
        return data.size();
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append("Rabbits available at ").append(name).append(":").append(System.lineSeparator());
        for(Rabbit rabbit:data){
            if(rabbit.isAvailable()) sb.append(rabbit.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
