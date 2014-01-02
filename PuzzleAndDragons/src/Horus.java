
public class Horus implements God {
	public void summarize(Data data) {
		System.out.printf("Horus activates %.3f percent of the time.%n", data.activateHorus()*100);
		System.out.printf("Horus has an average multiplier of %.3f.%n", data.HorusDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.HorusDPS();
	}

}
