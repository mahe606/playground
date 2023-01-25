import java.util.Scanner;

public class FormatOutput {
    /// https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<1;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            s1= padString(s1);
            System.out.println(s1.concat(String.format("%03d",x)));

        }
        System.out.println("================================");

    }

    static String padString(String str){
        for(int i=str.length();i<15;i++){
            str+=" ";
        }
        return str;
    }
}

