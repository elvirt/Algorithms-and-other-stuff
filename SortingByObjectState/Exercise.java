import java.util.ArrayList;

public class Exercise implements Comparable<Exercise> {
	private int repetitions;
	private int sets;
	private int time;
	private String machine;
	
	public Exercise(Machine machine, int repetitions, int sets, int time) {
		this.machine = machine.getName();
		this.repetitions = repetitions;
		this.sets = sets;
		this.time = time;
	}
	
	
	public int getTime() {
		return this.time;
	}


	@Override
	public int compareTo(Exercise o) {
		return this.time - o.time;
	}
	
	@Override
	public String toString() {
		return "Machine type:" + this.machine + "] Number of Repetitions:" + this.repetitions + "] Sets:" + this.sets + " Time: " + this.time;
	}
	
	
}
