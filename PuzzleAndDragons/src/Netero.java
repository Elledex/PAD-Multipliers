
public class Netero implements God {
	public void summarize(Data data) {
		System.out.printf("Netero activates %.3f percent of the time.%n", data.activateNetero()*100);
		System.out.printf("Netero has an average multiplier of %.3f.%n", data.NeteroDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.NeteroDPS();
	}

}
