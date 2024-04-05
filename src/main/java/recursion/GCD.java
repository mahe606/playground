package recursion;

public class GCD {
    public static int gcd(int num1, int num2) {
        System.out.println(num1 + " " + num2);
        if(num2 == 0) {
            return num1;
        }
        return gcd(num2, num1%num2);
    }

    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 12;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }
}
