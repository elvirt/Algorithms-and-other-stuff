
public enum Machine {
	//LegExercises
	PRESSMACHINE("Leg Press"), SMITHMACHINE("Smith Machine"), LEGCURLMACHINE("Leg Curl Machine"),
	HACKSQUATMACHINE("Heck Squat Machine"),
	
	//ArmExercises
	PULLDOWNS, CHINUPS, FRENCHPRESS, PUSHDOWNS;
	
	private String name;
	
	Machine(){}
	
	Machine(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
