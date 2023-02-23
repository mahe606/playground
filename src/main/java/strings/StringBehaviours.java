package strings;

public class StringBehaviours {
    public static void main(String[] args) {


        // String Literals - creates the value in a common pool in heap
        String s1 = "Mahesh";
        String s2 = "Mahesh";


        // String Objects - each object gets a separate space in heap
        String s3 = new String("Mahesh");
        String s4 = new String("Mahesh");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
    }
}
