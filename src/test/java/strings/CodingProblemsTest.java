package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodingProblemsTest {

    @Test
    public void validateIPAddress() {
        assertEquals(true, CodingProblems.validateIPAddress("1.1.1.1"));
    }

    @Test
    public void validateIPAddress1() {
        assertEquals(false, CodingProblems.validateIPAddress("1.1.1.344"));
    }

    @Test
    public void validateIPAddress2() {
        assertEquals(false, CodingProblems.validateIPAddress("1.1.1.344.1"));
    }

    @Test
    public void validateIPAddress3() {
        assertEquals(false, CodingProblems.validateIPAddress("1.1.1"));
    }


}