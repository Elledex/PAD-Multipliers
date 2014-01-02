
public class FFHorus implements God {
	public void summarize(Data data) {
		System.out.printf("FFHorus activates %.3f percent of the time.%n", data.activateHorus()*100);
		System.out.printf("FFHorus has an average multiplier of %.3f.%n", data.FFHorusDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.FFHorusDPS();
	}

}
