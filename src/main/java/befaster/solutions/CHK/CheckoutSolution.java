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
        	if(entry.getValue()<5) {
        	total+=entry.getValue()%3*50;
        	total+=entry.getValue()/3*130;
        	}else {
        		int remainder = entry.getValue().intValue()%5;
        		if(remainder >2) {
        		total+= remainder%3*50;
             	total+= remainder/3*130; 
        		} 
        	 else
        	   total+=entry.getValue()%5*50;
        	total+=entry.getValue()/5*200;
        	}
        	break;
        case "B" :
        	int numItemE =0;
        	// check if the number of item E is not a null  
        	if(frenquencyChars.get("E")!=null)
        		numItemE = frenquencyChars.get("E").intValue();
        	// check if number if item B is more than discount E
        	if(entry.getValue()> numItemE/2) {
        	total+=(entry.getValue() - numItemE/2)%2*30;
        	total+=(entry.getValue() - numItemE/2)/2*45;
        	}
        	break;
        case "C" :
        	total+=entry.getValue()*20;
        	break;
        case "D" :
        	total+=entry.getValue()*15;
        	break;
        case "E" :
        	total+=entry.getValue()*40;
        	break;
        case "F" :
        	int numItemF = entry.getValue().intValue();
        	int discount = numItemF/3;
        	total+=(numItemF - discount)*10;
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
