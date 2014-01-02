
public class LLRa implements God {
	public void summarize(Data data) {
		System.out.printf("LLRa activates x16 %.3f percent of the time.%n", (data.activateNetero()-data.activateHardRa())*100);
		System.out.printf("LLRa activates x49 %.3f percent of the time.%n", data.activateHardRa()*100);
		System.out.printf("LLRa has an average multiplier of %.3f.%n", data.LLRaDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.LLRaDPS();
	}

}
