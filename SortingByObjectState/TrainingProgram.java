import java.util.ArrayList;

public class TrainingProgram {
	
	String name;
	
	ArrayList <Exercise> exercises = new ArrayList<>();
	
	TrainingProgram(String name){
		this.name = name;
	}
	
	
	public void addExercise(Exercise exercise) {
		exercises.add(exercise);
	}
	
}
