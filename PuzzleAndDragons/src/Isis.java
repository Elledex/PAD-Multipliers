
public class Isis implements God {
	public void summarize(Data data) {
		System.out.printf("Isis activates %.3f percent of the time.%n", data.activateIsis()*100);
		System.out.printf("Isis has an average multiplier of %.3f.%n", data.IsisDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.IsisDPS();
	}

}
