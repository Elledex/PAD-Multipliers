
public class Bastet implements God {
	public void summarize(Data data) {
		System.out.printf("Bastet activates 100 percent of the time.%n");
		System.out.printf("Bastet has an average multiplier of %.3f.%n", data.BastetDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.BastetDPS();
	}

}
