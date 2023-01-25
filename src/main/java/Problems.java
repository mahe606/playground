public class Problems {
    public static void main(String[] args) {
        findSmallest( 30, 1100 ,10);
    }

    // print 1 to 100 without loop
    static void printNumber(int num){
        if(num <= 100){
            System.out.println(num);
            num++;
            printNumber(num);
        }
    }


    // Find smallest of 3 numbers with less code
    // solution use another variable
    static void findSmallest(int x, int y, int z){
        int num = 0;

        if(x<y)
            num = x;
        else
            num = y;

        if(z < num)
            num = z;
        System.out.println(num);
    }

}
