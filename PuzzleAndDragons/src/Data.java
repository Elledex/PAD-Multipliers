
public class Data {
	private double exactlyThreeColors = 0.0;
	private double exactlyFourColors = 0.0;
	private double threeColors = 0.0;
	private double fourColors = 0.0;
	private double fiveColors = 0.0;
	private double fourPlusHearts = 0.0;
	private double fivePlusHearts = 0.0;
	private double exactlySixCombos = 0.0;
	private double exactlySevenCombos = 0.0;
	private double exactlyEightCombos = 0.0;
	private double exactlyNineCombos = 0.0;
	private double exactlyTenCombos = 0.0;
	private int runs;
	
	public Data(int runs, int numColors, boolean hearts) {
		this.runs = runs;
		for (int i = 0; i < runs; i++) {
			Board board = new Board(numColors, hearts);
			int numColorsPossible = board.getNumColorsPossible();
			int heartsPossible = board.heartsPossible();
			int numCombosPossible = board.getNumCombosPossible();
			if (board.isChinesePossible()) {
				exactlyThreeColors++;
			}
			if (board.isKirinOrUmiYamaPossible()) {
				exactlyFourColors++;
			}
			switch (numColorsPossible) {
				case 5: fiveColors++;
						break;
				case 4: fourColors++;
						break;
				case 3: threeColors++;
						break;
			}
			
			if (heartsPossible == 1) {
				switch (numColorsPossible+heartsPossible) {
					case 6: fivePlusHearts++;
							break;
					case 5: fourPlusHearts++;
							break;
				}
			}

			switch (numCombosPossible) {
				case 6: exactlySixCombos++;
						break;
				case 7: exactlySevenCombos++;
						break;
				case 8: exactlyEightCombos++;
						break;
				case 9: exactlyNineCombos++;
						break;
				case 10: exactlyTenCombos++;
						break;
			}
		}
	}
	
	public double activateChinese() {
		return exactlyThreeColors/runs;
	}
	
	public double activateKirinOrUmiYama() {
		return exactlyFourColors/runs;
	}
	
	public double activateIsis() {
		return (threeColors + fourColors + fiveColors)/runs;
	}
	
	public double activateHorus() {
		return (fourColors + fiveColors)/runs;
	}
	
	public double activateRa() {
		return fiveColors/runs;
	}

	public double activateHardRa() {
		return fivePlusHearts/runs;
	}
	
	public double activateAnubis() {
		return exactlyTenCombos/runs;
	}
	
	public double activateNetero() {
		return (fourPlusHearts + fiveColors)/runs;
	}

	
	public double activateOokuninushi() {
		return (exactlySixCombos + exactlySevenCombos + 
				exactlyEightCombos + exactlyNineCombos + exactlyTenCombos)/runs;
	}
	
	public double activateRobin() {
		return (exactlyEightCombos + exactlyNineCombos + exactlyTenCombos)/runs;
	}
	
	
	public double ChineseDPS() {
		return this.activateChinese()*12.25 + (1-this.activateChinese());
	}
	
	public double KirinOrUmiYamaDPS() {
		return this.activateKirinOrUmiYama()*25 + (1-this.activateKirinOrUmiYama());
	}
	
	public double BastetDPS() {
		return (exactlySixCombos*12.25 + 
				(exactlySevenCombos + exactlyEightCombos + exactlyNineCombos + exactlyTenCombos)*16)/runs;
	}
	
	public double IsisDPS() {
		return this.activateIsis()*9 + (1-this.activateIsis());
	}
	
	public double WWIsisDPS() {
		return (threeColors*9 + fourColors*3.25*3.25 + fiveColors*12.25)/runs + 
				(1-(threeColors + fourColors + fiveColors)/runs);
	}
	
	public double WLIsisDPS() {
		return (threeColors*9 + fourColors*12.25 + fiveColors*16)/runs + 
				(1-(threeColors + fourColors + fiveColors)/runs);
	}
	
	public double HorusDPS() {
		return this.activateHorus()*16 + (1-this.activateHorus());
	}
	
	public double FFHorusDPS() {
		return (fourColors*16 + fiveColors*20.25)/runs + (1-(fourColors + fiveColors)/runs);
	}

	public double FLHorusDPS() {
		return (fourColors*16 + fiveColors*25)/runs + (1-(fourColors + fiveColors)/runs);
	}
	
	public double RaDPS() {
		return this.activateRa()*36 + (1-this.activateRa());
	}
	
	public double LLRaDPS() {
		return this.activateNetero()*16 + fivePlusHearts*49/runs;
	}
	
	public double AnubisDPS() {
		return this.activateAnubis()*100 + (1-this.activateAnubis());
	}
	
	public double NeteroDPS() {
		return this.activateNetero()*20.25 + (1-this.activateNetero());
	}
	
	public double OokuninushiDPS() {
		return this.activateOokuninushi()*16 + (1-this.activateOokuninushi());
	}
	
	public double RobinDPS() {
		return (exactlyEightCombos*16 + exactlyNineCombos*36 + exactlyTenCombos*100)/runs +
				(1-(exactlyEightCombos + exactlyNineCombos + exactlyTenCombos)/runs);
	}
	
	
}
