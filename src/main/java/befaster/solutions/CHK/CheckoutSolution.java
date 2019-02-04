package befaster.solutions.CHK;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	
        int total =0;
        
        // change string to char streams and create map with no of char occurrence
        
        Map<String, Long> frenquencyChars = Arrays.stream(
        		skus.split("")).collect(
        		Collectors.groupingBy(c -> c, Collectors.counting()));
        for(Entry<String,Long> entry : frenquencyChars.entrySet()) {
        		
        switch (entry.getKey()) {
        case "" :
        	total=0;
        	break;
        case "A" :
        	total+=entry.getValue()%3*50;
        	total+=entry.getValue()/3*50;
        	break;
        case "B" :
        	total+=entry.getValue()%2*30;
        	total+=entry.getValue()/2*30;
        	break;
        case "C" :
        	total+=entry.getValue()*20;
        	break;
        case "D" :
        	total+=entry.getValue()*15;
        	break;
        default :
        	total =-1;
        	break;
        }
        if(total==-1)
        	break;
        
    }
     return total;
  }
}

