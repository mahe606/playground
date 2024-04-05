public class TestCode {



    public static void main(String[] args) {
        float input = 1800000;
        float appreciation = 10;
        int years = 7;

        float result = input;
        for (int i = 1; i <= years; i++) {
            result += result * (appreciation/100);
            System.out.println("year " + i +" = " + result );
        }

        System.out.println(result);
    }
}
