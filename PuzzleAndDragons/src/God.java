
public interface God {
	/**
	 * Prints out a summary
	 * @param data the data to be summarized
	 */
	void summarize(Data data);
	
	/**
	 * 
	 * @param data the data to be interpreted
	 * @return the average multiplier per board
	 */
	double getAverageMultiplier(Data data);
}
