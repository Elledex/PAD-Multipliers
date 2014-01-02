
public class KirinOrUmiYama implements God {
	public void summarize(Data data) {
		System.out.printf("KirinOrUmiYama activates %.3f percent of the time.%n", data.activateKirinOrUmiYama()*100);
		System.out.printf("KirinOrUmiYama has an average multiplier of %.3f.%n", data.KirinOrUmiYamaDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.KirinOrUmiYamaDPS();
	}

}
