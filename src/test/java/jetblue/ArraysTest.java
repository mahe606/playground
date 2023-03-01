package jetblue;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void moveZerosToOneSide() {
        int k[] =  {8,7,0,4,0,2,1,9,0};
        Arrays.moveZerosToOneSide(k);
    }
}