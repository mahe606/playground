package recursion;

public class Combinations {
    public static void main(String[] args) {
        combinations("1234", "abc");
    }

    public static void combinations(String a, String b) {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        for (char char1 : aArray) {
            for(char char2: bArray){
                System.out.println(char1+" - "+ char2);
            }
        }
    }

    public static void combinationsRec(char[] a, char[] b){
        if(a.length == 0 && b.length == 0){
            return;
        }

        
    }

}
