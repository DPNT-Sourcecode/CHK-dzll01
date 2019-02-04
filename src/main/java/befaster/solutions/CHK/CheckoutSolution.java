package befaster.solutions.CHK;



public class CheckoutSolution {
    public Integer checkout(String skus) {
        int total =0;
        switch (skus) {
        case "A" :
        	total=50;
        	break;
        case "B" :
        	total=30;
        	break;
        case "C" :
        	total=20;
        	break;
        case "D" :
        	total=10;
        	break;
        default :
        	total =-1;
        	break;
        }
        return total;
    }
}

