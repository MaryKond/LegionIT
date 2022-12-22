import Test1.WeekDays;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class WeekDayTest {

    @ParameterizedTest
    @CsvSource ({"1,Sunday","2, Monday","3,Tuesday","4, Wednesday","5,Thursday","6, Friday","7,Saturday"})
    public void csvSourceTest(int dayNumber,String expectedResult){
        String actualResult=WeekDays.getDay(dayNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void negativeTest(){
        var dayNumber = new WeekDays();
//        assertThrows(IllegalArgumentException.class,()->{dayNumber.getDay(0);});
//        assertThrows(IllegalArgumentException.class,()->{dayNumber.getDay(10);});
        assertEquals(dayNumber.getDay(0),"The number should be equal or larger than 1");
        assertEquals(dayNumber.getDay(10),"The number should be equal or smaller than 7");


    }
    @Test
    @DisplayName("NullPointer Exception test")
    public void errorTst(){
        assertThrows(NullPointerException.class,()->{WeekDays.getDay(null);});

    }}

