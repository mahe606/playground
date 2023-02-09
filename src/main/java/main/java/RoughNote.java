package main.java;

public class RoughNote {
    public static void main(String[] args) {
        RoughNote roughNote = new RoughNote();
        sum(3, 6);
        roughNote.sum(23, 20);
        RoughNote.sum(2, 2);
    }


    public static int sum(int a, int b){
        return a+b;
    }

    public int average(int a, int b){
        return sum(a, b)/2;
    }


}
