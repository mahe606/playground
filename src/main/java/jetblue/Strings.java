package main.java.jetblue;

public class Strings {

    public static void main(String[] args) {
        System.out.println(checkStringRotation("mahesh", "shmah"));
    }


    public static boolean checkStringRotation(String str1, String str2){
        if(str1.length()!=str2.length())
            return false;
        // concat will same string
        str1 = str1.concat(str1);
        if (str1.indexOf(str2) > 0)
            return true;
        else
        return false;
    }
}
