
public class Ra implements God {
	public void summarize(Data data) {
		System.out.printf("Ra activates %.3f percent of the time.%n", data.activateRa()*100);
		System.out.printf("Ra has an average multiplier of %.3f.%n", data.RaDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.RaDPS();
	}
}
