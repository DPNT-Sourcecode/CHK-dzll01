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
        	int numFitemDic, numSitemDic,  numItem, cost,firstCostDisc,secondCostDisc;
        		
        switch (entry.getKey()) {
        case "" :
        	total=0;
        	break;
        case "A" :
        	numFitemDic=3;
        	numSitemDic=5; 
        	numItem = entry.getValue().intValue();
        	cost=50; 
        	firstCostDisc=130;
        	secondCostDisc=200;
        	total+=this.calculate(numFitemDic, numSitemDic, numItem, cost, firstCostDisc, secondCostDisc);
        	break;
        case "B" :
        	numFitemDic=2;
        	int numItemE =0;
        	// check if the number of item E is not a null  
        	if(frenquencyChars.get("E")!=null)
        		numItemE = frenquencyChars.get("E").intValue()/numFitemDic;
        	// check if number if item B is more than discount E
        	
        	numSitemDic=0; 
        	numItem = (entry.getValue().intValue()- numItemE);
        	cost=30; 
        	firstCostDisc=45;
        	secondCostDisc=0;
        	total+=this.calculate(numFitemDic, numSitemDic, numItem, cost, firstCostDisc, secondCostDisc);
        	break;
        case "C" :
        	total+=entry.getValue()*20;
        	break;
        case "D" :
        case "M" :
        	//total+=entry.getValue()*15;
        	numFitemDic=3;
        	int numItemN =0;
        	// check if the number of item N is not a null  
        	if(frenquencyChars.get("N")!=null)
        		numItemN = frenquencyChars.get("N").intValue()/numFitemDic;
        	// check if number if item N is more than discount E
        	numSitemDic=0; 
        	numItem = (entry.getValue().intValue() - numItemN);
        	cost=15; 
        	firstCostDisc=0;
        	secondCostDisc=0;
        	total+=this.calculate(numFitemDic, numSitemDic, numItem, cost, firstCostDisc, secondCostDisc);
        	break;
        case "E" :
        	total+=entry.getValue()*40;
        	break;
        case "F" :
        	int numItemF = entry.getValue().intValue();
        	int discount = numItemF/3;
        	total+=(numItemF - discount)*10;
        	break;
        case "G" :
        case "T" :
        case "W" :
        	total+=entry.getValue()*20;
        	break;
        case "H" :
        	numFitemDic=5;
        	numSitemDic=10; 
        	numItem = entry.getValue().intValue();
        	cost=10; 
        	firstCostDisc=45;
        	secondCostDisc=80;
        	total+=this.calculate(numFitemDic, numSitemDic, numItem, cost, firstCostDisc, secondCostDisc);
        	break;
        case "I" :
        	total+=entry.getValue()*35;
        	break;
        case "J" :
        	total+=entry.getValue()*60;
        	break;
        case "K" :
        	numFitemDic=2;
        	numSitemDic=0; 
        	numItem = entry.getValue().intValue();
        	cost=80; 
        	firstCostDisc=150;
        	secondCostDisc=0;
        	total+=this.calculate(numFitemDic, numSitemDic, numItem, cost, firstCostDisc, secondCostDisc);
        	break;
        case "L" :
        case "X" :
        	total+=entry.getValue()*90;
        	break;
        case "N" :
        	total+=entry.getValue()*40;
        	break;
        case "O" :
        case "Y" :
        	total+=entry.getValue()*10;
        	break;
        case "P" :
        	numFitemDic=5;
        	numSitemDic=0; 
        	numItem = entry.getValue().intValue();
        	cost=50; 
        	firstCostDisc=200;
        	secondCostDisc=0;
        	total+=this.calculate(numFitemDic, numSitemDic, numItem, cost, firstCostDisc, secondCostDisc);
        	break;
        case "Q" :
        	numFitemDic=3;
        	numSitemDic=0; 
        	numItem = entry.getValue().intValue();
        	cost=30; 
        	firstCostDisc=80;
        	secondCostDisc=0;
        	total+=this.calculate(numFitemDic, numSitemDic, numItem, cost, firstCostDisc, secondCostDisc);
        	break;
        case "R" :
        	total+=entry.getValue()*50;
        	break;
        case "S" :
        	total+=entry.getValue()*30;
        	break;
        case "U" :
        	total+=entry.getValue()*40;
        	break;
        case "V" :
        	total+=entry.getValue()*50;
        	break;
        case "Z" :
        	total+=entry.getValue()*50;
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
    public Integer calculate(int numFitemDic,int numSitemDic, int numItem, int cost, int firstCostDisc, int secondCostDisc) {
    	int total = 0;
    	if(numItem<numSitemDic || numSitemDic ==0 ) {
        	total+=numItem%numFitemDic*cost;
        	total+=numItem/numFitemDic*firstCostDisc;
        	}else {
        		int remainder = numItem%numSitemDic;
        		if(remainder >=numFitemDic) {
        		total+= remainder%numFitemDic*cost;
             	total+= remainder/numFitemDic*firstCostDisc; 
        		} 
        	 else
        	   total+=numItem%numSitemDic*cost;
        	total+=numItem/numSitemDic*secondCostDisc;
        	}
    return total;	
    }
}
