package Kata2;

public class HistogramDisplay {
    private final Histogram histogram;
    
    public HistogramDisplay(Histogram histogram){
        this.histogram = histogram;
    }
    public void execute(){
        for (int v : histogram.getValues()){
            System.out.println(v + ": " + histogram.getCont(v));
        }
    }
}
