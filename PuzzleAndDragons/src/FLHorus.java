
public class FLHorus implements God {
	public void summarize(Data data) {
		System.out.printf("FLHorus activates %.3f percent of the time.%n", data.activateHorus()*100);
		System.out.printf("FLHorus has an average multiplier of %.3f.%n", data.FLHorusDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.FLHorusDPS();
	}

}
