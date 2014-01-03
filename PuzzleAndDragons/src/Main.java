import java.util.*;

public class Main {
	public static void main(String[] args) {
		int numColors = 3;
		boolean hearts = true;
		int runs = 100000000;
		boolean factorInDropDowns = true;
		Data data = new Data(runs, numColors, hearts, factorInDropDowns);
		Bastet bastet = new Bastet();
		Isis isis = new Isis();
		WWIsis wwisis = new WWIsis();
		WLIsis wlisis = new WLIsis();
		Horus horus = new Horus();
		FFHorus ffhorus = new FFHorus();
		FLHorus flhorus = new FLHorus();
		Ra ra = new Ra();
		LLRa llra = new LLRa();
		Anubis anubis = new Anubis();
		Chinese chinese = new Chinese();
		KirinOrUmiYama kouy = new KirinOrUmiYama();
		Ookuninushi ookuninushi = new Ookuninushi();
		Netero netero = new Netero();
		Robin robin = new Robin();
		
		System.out.printf("Data for %d runs with %d colors %n", runs, numColors);
		if (hearts) {
			System.out.println("(There are hearts)");
		}
		bastet.summarize(data);
		isis.summarize(data);
		wwisis.summarize(data);
		wlisis.summarize(data);
		horus.summarize(data);
		ffhorus.summarize(data);
		flhorus.summarize(data);
		ra.summarize(data);
		llra.summarize(data);
		anubis.summarize(data);
		chinese.summarize(data);
		kouy.summarize(data);
		ookuninushi.summarize(data);
		netero.summarize(data);
		robin.summarize(data);
		
        HashMap<String,Double> hm = new HashMap<String,Double>();
        ValueComparator bvc =  new ValueComparator(hm);
        TreeMap<String,Double> sorted_hm = new TreeMap<String,Double>(bvc);
        
		hm.put("Bastet", bastet.getAverageMultiplier(data));
		hm.put("Isis", isis.getAverageMultiplier(data));
		hm.put("WLIsis", wlisis.getAverageMultiplier(data));
		hm.put("WWIsis", wwisis.getAverageMultiplier(data));
		hm.put("Horus", horus.getAverageMultiplier(data));
		hm.put("FFHorus", ffhorus.getAverageMultiplier(data));
		hm.put("FLHorus", flhorus.getAverageMultiplier(data));
		hm.put("Ra", ra.getAverageMultiplier(data));
		hm.put("LLRa", llra.getAverageMultiplier(data));
		hm.put("Anubis", anubis.getAverageMultiplier(data));
		hm.put("Chinese", chinese.getAverageMultiplier(data));
		hm.put("KirinOrUmiYama", kouy.getAverageMultiplier(data));
		hm.put("Ookuninushi", ookuninushi.getAverageMultiplier(data));
		hm.put("Netero", netero.getAverageMultiplier(data));
		hm.put("Robin", robin.getAverageMultiplier(data));
		
		sorted_hm.putAll(hm);

        System.out.println("Summary: "+sorted_hm);
	}
}

class ValueComparator implements Comparator<String> {

    Map<String, Double> base;
    public ValueComparator(Map<String, Double> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.    
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}
