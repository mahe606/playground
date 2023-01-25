package Arrays;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        int intArray[][]  = new int[6][6];
        Scanner sc = new Scanner(System.in);
        intArray[0][0] = 1;
        intArray[0][1] = 1;
        intArray[0][2] = 1;
        intArray[1][1] = 1;
        intArray[2][0] = 1;
        intArray[2][1] = 1;
        intArray[2][2] = 1;
        intArray[3][2] = 2;
        intArray[3][3] = 4;
        intArray[3][4] = 4;
        intArray[4][3] = 2;
        intArray[5][2] = 1;
        intArray[5][3] = 2;
        intArray[5][4] = 4;

        int currVal = 0;
        int maxVal = 0;

        for(int i =0;i < 6;i++){
            for(int j = 0;j < 6;j++){
                System.out.print(intArray[i][j]+ " ");
            }
            System.out.println();
        }

        // loop till last but 2 rows
        for(int i =0;i < 4;i++){
            // loop till last but 2 columns
            for(int j = 0;j < 4;j++){

                currVal = intArray[i][j] + intArray[i][j+1] +intArray[i][j+2]  // 3 numbers in current row
                        + intArray[i+1][j+1]  // 1 number in next row
                        + intArray[i+2][j] + intArray[i+2][j+1] +intArray[i+2][j+2]; // 3 numbers in current row + 2

                if(currVal > maxVal){
                    maxVal = currVal;
                }
            }


        }
        System.out.println("The max value is "+ maxVal);
    }
}
