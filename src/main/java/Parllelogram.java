import java.util.Scanner;

public class Parllelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Height: ");
        int height = in.nextInt();
        System.out.println("Enter the Breath: ");
        int breath = in.nextInt();


        try{
            if(height <= 0 || breath <= 0){
                throw new Exception("Breadth and height must be positive");
            }else{
                System.out.printf("Area of parllelogram is %d", height * breath );
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
