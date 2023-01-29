package softUni;

import java.util.ArrayList;
import java.util.List;

public class SoftUni {
    private int capacity;
    private List<Student> data;


    public SoftUni(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }
    public int getCount(){
        return data.size();
    }

    public String insert(Student student){
        String result="";
            if(data.contains(student)){
                result=("Student is already in the hall.");
            }
            else if(data.size()>=capacity){
                result=("The hall is full.");
            }
            else{
                data.add(student);
                result=String.format("Added student %s %s.",student.getFirstName(),student.getLastName());
            }
        return result;
    }
    public String remove(Student student){
        String result="";
        if(data.contains(student)){
            data.remove(student);
            result=String.format("Removed student %s %s.",student.getFirstName(),student.getLastName());
        }
        else{
            result=("Student not found.");
        }
        return result;
    }
    public String getStatistics(){
        return toString();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(String.format("Hall size: %d%n", data.size()));
        for(Student student:data){
            result.append(String.format("Student: %s %s, Best Course = %s%n",student.getFirstName(),student.getLastName(),student.getBestCourse()));
        }
        return result.toString();
    }

    public Student getStudent(String firstName, String lastName) {
        for(Student student:data){
            if(student.getFirstName().equals(firstName)&&student.getLastName().equals(lastName)){
                return student;
            }
        }
        return null;
    }
}
