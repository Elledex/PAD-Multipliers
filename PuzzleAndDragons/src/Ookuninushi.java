
public class Ookuninushi implements God {
	public void summarize(Data data) {
		System.out.printf("Ookuninushi activates %.3f percent of the time.%n", data.activateOokuninushi()*100);
		System.out.printf("Ookuninushi has an average multiplier of %.3f.%n", data.OokuninushiDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.OokuninushiDPS();
	}

}
