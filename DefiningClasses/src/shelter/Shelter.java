package shelter;

import java.util.ArrayList;
import java.util.List;


public class Shelter {
    private List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>(capacity);
    }
    public void add(Animal animal){
        if(data.size()<capacity){
            data.add(animal);
        }
    }
    public boolean remove(String name){
        for(Animal animal:data){
            if(animal.getName().equals(name)){
                data.remove(animal);
                return true;
            }
        }
        return false;
    }
    public Animal getAnimal(String name, String caretaker){
        for(Animal animal:data){
            if(animal.getName().equals(name)&&animal.getCaretaker().equals(caretaker)){
                return animal;
            }
        }
        return null;
    }
    public Animal getOldestAnimal(){
        Animal oldest = null;
        int maxAge = 0;
        for(Animal animal:data){
            if(animal.getAge()>maxAge){
                maxAge = animal.getAge();
                oldest = animal;
            }
        }
        return oldest;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics(){
        return toString();
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("The shelter has the following animals:");
        string.append(System.lineSeparator());
        for(Animal animal:data){
            string.append(String.format("%s %s%n",animal.getName(),animal.getCaretaker()));
        }
        return string.toString();
    }
}
