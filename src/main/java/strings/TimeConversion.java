package strings;


//https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
public class TimeConversion {

    public static void main(String[] args) {
        timeConversion("01:05:45PM");
        timeConversion("12:05:45AM");
        timeConversion("06:40:03AM");
    }


    public static String timeConversion(String s) {
        // Write your code here
        String a[] = s.split(":");
        String result = null;
        if(a[2].contains("PM") && Integer.parseInt(a[0]) < 12){
            result = Integer.parseInt(a[0])+12+":"+a[1]+":"+a[2].substring(0, 2);
        }else if(Integer.parseInt(a[0])==12 && a[2].contains("AM")){
            result = "00"+":"+a[1]+":"+a[2].substring(0, 2);
        }else
            result = s.substring(0, s.length() - 2);
        System.out.println("input="+s + " output="+result);
        return result;
    }


}
