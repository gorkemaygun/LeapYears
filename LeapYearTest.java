import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LeapYearTest {
    @Test
    public void yearIsDivisibleBy4() {
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.isLeapYear(1996));
        assertEquals(true, leapYear.isLeapYear(2000));
        assertEquals(false, leapYear.isLeapYear(1900));
        assertEquals(true, leapYear.isLeapYear(2016));
        assertEquals(true, leapYear.isLeapYear(2020));
        assertEquals(false, leapYear.isLeapYear(1995));
        assertEquals(false, leapYear.isLeapYear(1775));
    }

}