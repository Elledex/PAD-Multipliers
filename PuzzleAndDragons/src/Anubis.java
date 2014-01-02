
public class Anubis implements God {
	public void summarize(Data data) {
		System.out.printf("Anubis activates %.3f percent of the time.%n", data.activateAnubis()*100);
		System.out.printf("Anubis has an average multiplier of %.3f.%n", data.AnubisDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.AnubisDPS();
	}

}
