import java.util.List;
import java.util.Scanner;

public class PrimeNumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int points = sc.nextInt();
        int exercises = sc.nextInt();

        List<Integer> primeNumbers= PrimeNumber.getPrimeNumbers(exercises);
        int total = 0;
        while(points == total){
            total = primeNumbers.get(exercises);
            exercises++;
        }
    }
}
