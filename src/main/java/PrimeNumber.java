import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static boolean isPrime(int num){
        boolean isPrime = true;
        int i=2;

        //loop until previous number (9 means loop till 8)
        // divide my each of the number and find if num is divisible by any of the previous numbers
        while (i<num){
            if(num%i == 0){
                isPrime = false;
            }
            i++;
        }
        if (isPrime){
            return true;
        }else{
            return false;
        }
    }


    public static List<Integer> getPrimeNumbers(int limit){
        List<Integer> primeNos = new ArrayList<Integer>();
        primeNos.add(2);
        int count = 2;
        int num = 3;
        while(count <= limit){
            if(isPrime(num)) {
                primeNos.add(num);
                count++;
            }
            num += 2;
        }
        return primeNos;
    }
}

