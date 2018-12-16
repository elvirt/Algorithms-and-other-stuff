import java.util.Collections;

public class TrainingProgramTest {

	public static void main(String[] args) {
		
		TrainingProgram program = new TrainingProgram("LegDay");
		
		Exercise ex1 = new Exercise(Machine.HACKSQUATMACHINE, 12, 3, 15);
		Exercise ex2 = new Exercise(Machine.LEGCURLMACHINE, 10, 3, 10);
		Exercise ex3 = new Exercise(Machine.PRESSMACHINE, 10, 4, 13);
		Exercise ex4 = new Exercise(Machine.SMITHMACHINE, 8, 4, 14);
		
		program.addExercise(ex1);
		program.addExercise(ex2);
		program.addExercise(ex3);
		program.addExercise(ex4);
		
		Collections.sort(program.exercises);
		
		for (Exercise exercise : program.exercises) {
			System.out.println(exercise);
		}
	}
}
