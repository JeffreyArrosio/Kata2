package Kata2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram {
    
    private final Map <Integer, Integer> conts = new HashMap<>();
    
    public Histogram(int... values){
        for (int value : values){
            conts.put(value, conts.getOrDefault(value, 0)+1);
        }
    }
    public Set <Integer> getValues(){
        return conts.keySet();
    }
    public int getCont(int value){
        return conts.get(value);
    }
}
