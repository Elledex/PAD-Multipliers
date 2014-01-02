
public class WWIsis implements God {
	public void summarize(Data data) {
		System.out.printf("WWIsis activates %.3f percent of the time.%n", data.activateIsis()*100);
		System.out.printf("WWIsis has an average multiplier of %.3f.%n", data.WWIsisDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.WWIsisDPS();
	}

}
