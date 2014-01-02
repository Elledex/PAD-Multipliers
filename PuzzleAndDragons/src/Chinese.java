
public class Chinese implements God {
	public void summarize(Data data) {
		System.out.printf("Chinese gods activate %.3f percent of the time.%n", data.activateChinese()*100);
		System.out.printf("Chinese gods have an average multiplier of %.3f.%n", data.ChineseDPS());
	}
	
	public double getAverageMultiplier(Data data) {
		return data.ChineseDPS();
	}

}
