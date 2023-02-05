package workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Workout {
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        exercises = new ArrayList<>();
    }
    public void addExercise(Exercise exercise){
        if(exercises.size()<exerciseCount) exercises.add(exercise);
    }
    public boolean removeExercise(String name, String muscle){
        for(Exercise exercise:exercises){
            if(exercise.getName().equals(name)&&exercise.getMuscle().equals(muscle)){
                exercises.remove(exercise);
                return true;
            }
        }
        return false;
    }
    public Exercise getExercise(String name, String muscle){
        for(Exercise exercise:exercises){
            if(exercise.getName().equals(name)&&exercise.getMuscle().equals(muscle)){
                return exercise;
            }
        }
        return null;
    }
    public Exercise getMostBurnedCaloriesExercise(){
        return exercises.stream().max(Comparator.comparing(x->x.getBurnedCalories())).get();
    }

    public int getExerciseCount() {
        return exerciseCount;
    }
    public String getStatistics(){
        return toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Workout type: %s",type));
        stringBuilder.append(System.lineSeparator());
        for (Exercise exercise:exercises){
            stringBuilder.append(exercise.toString());
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
