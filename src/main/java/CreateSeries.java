import java.util.*;
        import java.io.*;

class CreateSeries{
    //
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        double result = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            result = a;
            for(int j = 0;j< n;j++){
                result = result + (Math.pow(2,j) * b);
                System.out.print((int)result + " ");
            }
        }
        in.close();
    }
}