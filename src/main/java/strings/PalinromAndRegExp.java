package strings;

public class PalinromAndRegExp {


    public static void main(String[] args) {
        String input = "M aD/n am!";
        input = removeSpecialChars(input);
        System.out.println(input);
    }


    public static String removeSpecialChars(String s){
        s = s.replaceAll("[^\\w]","");
        return s;
    }
}
