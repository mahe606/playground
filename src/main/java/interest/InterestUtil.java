package interest;

public class InterestUtil {
    public static void main(String[] args) {
        calculateInterest();
    }

    public static void calculateInterest(){
        int years = 10;
        int initialVal = 300000;
        int interestval = 36000;
        int lakhs;
        int gain = 0;
        int currVal;
        currVal = initialVal;
        for (int i = 0; i < years; i++) {
            if(gain > 100000){
                currVal += (gain/100000) * 100000;
                gain = gain%100000;
            }
            lakhs = currVal/100000;
            gain = gain + (lakhs*interestval);
            System.out.println("Year " + (i+1) + " lakhs " + lakhs + " gain "+ gain + " total " + (currVal+gain));
        }
    }



}
