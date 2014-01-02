
public class WLIsis implements God {
	public void summarize(Data data) {
		System.out.printf("WLIsis activates %.3f percent of the time.%n", data.activateIsis()*100);
		System.out.printf("WLIsis has an average multiplier of %.3f.%n", data.WLIsisDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.WLIsisDPS();
	}

}
