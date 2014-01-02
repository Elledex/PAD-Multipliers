
public class Robin implements God {
	public void summarize(Data data) {
		System.out.printf("Robin activates %.3f percent of the time.%n", data.activateRobin()*100);
		System.out.printf("Robin has an average multiplier of %.3f.%n", data.RobinDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.RobinDPS();
	}

}
