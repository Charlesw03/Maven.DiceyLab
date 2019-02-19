import java.util.TreeMap;

public class Bins {
    Dice dice = new Dice( 2);



    private TreeMap< Integer,Integer> bins;


    public Bins (Integer minRoll, Integer maxRoll){
        bins = new TreeMap<Integer, Integer>();

        for (int i = minRoll; i <= maxRoll ; i++) {
            bins.put(i,0);
        }
    }

        public void binStoreVal(int result){
            bins.put(result,bins.get(result) +1);
        }


    public Integer getBins(Integer binNum) {
        return bins.get(binNum);
    }

    public void setBins(TreeMap<Integer, Integer> bins) {
        this.bins = bins;
    }


}
